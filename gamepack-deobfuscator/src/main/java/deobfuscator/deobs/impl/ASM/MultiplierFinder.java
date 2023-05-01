package deobfuscator.deobs.impl.ASM;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import lombok.Getter;
import lombok.val;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import shared.Constants;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class MultiplierFinder extends AbstractDeob {
    private static ObjectMapper jsonMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
            .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

    @Override
    public void run() {
        Multipliers multipliers = new Multipliers();
        Analyzer analyzer = new Analyzer(new Interpret(multipliers));
        for (ClassNode classNode: Deobfuscator.classMapASM.values()) {
            for (MethodNode methodNode: classNode.methods) {
                try {
                    analyzer.analyze(classNode.name, methodNode);
                } catch (AnalyzerException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        multipliers.solve();

        try {
            jsonMapper.writeValue(Constants.MULTIPLIER_JSON.toFile(), multipliers.decoders); //TODO toSortedMap was removed here
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private class Multipliers {

        private Map<String, Number> decoders = new HashMap<>();

        private Multimap<String, Mul> mulX = MultimapBuilder.hashKeys().arrayListValues().build();

        private Set<FieldMulAssign> decEncX = new HashSet<>();

        public void solve() {
            while (true) {
                simplify();
                if (mulX.isEmpty()) {
                    return;
                }
                solveOne();
            }
        }

        private void simplify() {
            Iterator<FieldMulAssign> itr = decEncX.iterator();
            while (itr.hasNext()) {
                FieldMulAssign ma = itr.next();
                if (decoders.containsKey(ma.put)) {
                    itr.remove();
                    Number dec = decoders.get(ma.put);
                    Number decx = mul(dec, ma.mul);
                    if (isMultiplier(decx)) {
                        mulX.put(ma.get, Mul.dec(decx));
                    }
                } else if (decoders.containsKey(ma.get)) {
                    itr.remove();
                    Number enc = MultiplierFinderUtilities.invert(decoders.get(ma.get));
                    Number encx = mul(enc, ma.mul);
                    if (isMultiplier(encx)) {
                        mulX.put(ma.put, Mul.enc(encx));
                    }
                }
            }
        }

        private void solveOne() {
            Map.Entry<String, Collection<Mul>> e = mulX.asMap().entrySet().stream()
                    .filter(x -> decEncX.stream().noneMatch(y -> y.get.equals(x.getKey()) || y.put.equals(x.getKey())))
                    .findFirst()
                    .orElse(mulX.asMap().entrySet().iterator().next());
            String f = e.getKey();
            Number ms = unfold(e.getValue());
            decoders.put(f, ms);
            mulX.removeAll(f);
        }

        private Number unfold(Collection<Mul> ms) {
            Set<Mul> distinct = new HashSet<>(ms);
            if (distinct.size() == 1) {
                return distinct.iterator().next().decoder;
            }
            List<Mul> pairs = distinct.stream()
                    .filter(a -> a.dec && distinct.stream().anyMatch(b -> !b.dec && Objects.equals(a.decoder, b.decoder)))
                    .collect(Collectors.toList());
            if (!pairs.isEmpty()) {
                return pairs.iterator().next().decoder;
            }
            List<Mul> fs = distinct.stream()
                    .filter(f -> distinct.stream().allMatch(it -> isFactor(it, f)))
                    .collect(Collectors.toList());
            if (fs.size() == 1) {
                return fs.iterator().next().decoder;
            }
            Objects.requireNonNull(fs.size() == 2 && fs.get(0).dec != fs.get(1).dec);
            return fs.stream().filter(Mul::isDec).findFirst().get().decoder;
        }

        private boolean isFactor(Mul product, Mul factor) {
            return Math.abs(div(product, factor).longValue()) <= 0xffL;
        }

        private Number div(Mul a, Mul b) {
            if (a.dec == b.dec) {
                return mul(MultiplierFinderUtilities.invert(b.n), a.n);
            } else {
                return mul(b.n, a.n);
            }
        }

        private Number mul(Number a, Number b) {
            if (a instanceof Integer) {
                return a.intValue() * b.intValue();
            } else if (a instanceof Long) {
                return a.longValue() * b.longValue();
            } else {
                throw new IllegalArgumentException(a.getClass().getSimpleName());
            }
        }
    }

    class Interpret extends Interpreter<Valu> {

        private final Multipliers multipliers;
        private final Set<Valu> ldcs = new HashSet<>();
        private final Set<Valu> ldcs2 = new HashSet<>();
        private final Map<Valu, Valu> puts = new HashMap<>();
        private final SourceInterpreter src = new SourceInterpreter();

        Interpret(Multipliers multipliers) {
            super(Opcodes.V1_8);
            this.multipliers = multipliers;
        }

        @Override
        public SourceValue newValue(Type type) {
            return src.newValue(type) != null ? new Valu(src.newValue(type)) : null;
        }

        @Override
        public Valu copyOperation(AbstractInsnNode insn, Valu value) {
            switch (insn.getOpcode()) {
                case Opcodes.DUP:
                case Opcodes.DUP2:
                case Opcodes.DUP2_X1:
                case Opcodes.DUP_X1:
                    return value;
                default:
                    return new Valu(src.copyOperation(insn, value.v));
            }
        }

        @Override
        public Valu merge(Valu value1, Valu value2) {
            return new Valu(src.merge(value1.v, value2.v));
        }

        @Override
        public void returnOperation(AbstractInsnNode insn, Valu value, Valu expected) {
        }

        @Override
        public Valu ternaryOperation(AbstractInsnNode insn, Valu value1, Valu value2, Valu value3) {
            return new Valu(src.ternaryOperation(insn, value1.v, value2.v, value3.v));
        }

        @Override
        public Valu naryOperation(AbstractInsnNode insn, List<? extends Valu> values) {
            List<SourceValue> srcValues = new ArrayList<>();
            for (Valu value : values) {
                srcValues.add(value.v);
            }
            return new Valu(src.naryOperation(insn, srcValues));
        }

        @Override
        public Valu newOperation(AbstractInsnNode insn) {
            return new Valu(src.newOperation(insn));
        }

        @Override
        public Valu unaryOperation(AbstractInsnNode insn, Valu value) {
            Valu newValu = new Valu(src.unaryOperation(insn, value.v));
            if (insn.getOpcode() == Opcodes.PUTSTATIC) {
                setField(newValu, value);
            }
            return newValu;
        }

        @Override
        public Valu binaryOperation(AbstractInsnNode insn, Valu value1, Valu value2) {
            Valu.Two result = new Valu.Two(src.binaryOperation(insn, value1.v, value2.v), value1, value2);
            switch (insn.getOpcode()) {
                case Opcodes.IMUL:
                case Opcodes.LMUL:
                    FieldMul fieldMul = asFieldMul(result);
                    if (fieldMul != null) {
                        if (ldcs.add(fieldMul.ldc)) {
                            multipliers.mulX.put(fieldMul.f.fieldName, Mul.dec(fieldMul.ldc.ldcNum));
                        }
                    }
                    break;
                case Opcodes.PUTFIELD:
                    setField(result, value2);
                    break;
            }
            return result;
        }

        private void setField(Valu put, Valu value) {
            puts.put(value, put);
            if (value.isLdcInt()) {
                //
            } else if (value instanceof Valu.Two) {
                distribute((FieldInsnNode) put.v.insn, (Valu.Two) value);
            }
        }

        private void distribute(FieldInsnNode put, Valu.Two value) {
            if (value.isMul()) {
                FieldMul fm = asFieldMul(value);
                if (fm != null && ldcs2.add(fm.ldc)) {
                    assert multipliers.mulX.remove(fm.f.fieldName, Mul.dec(fm.ldc.ldcNum));
                    multipliers.decEncX.add(new FieldMulAssign(put.name, fm.f.fieldName, fm.ldc.ldcNum));
                    return;
                }
            }
            if (!value.isMul() && !value.isAdd()) {
                return;
            }
            Valu a = value.a;
            Valu b = value.b;
            Valu ldc = null;
            Valu other = null;
            if (a.isLdcInt()) {
                ldc = a;
                other = b;
            } else if (b.isLdcInt()) {
                ldc = b;
                other = a;
            }
            if (ldc != null && other != null) {
                int n = ldc.ldcNum;
                if (isMultiplier(n) && ldcs.add(ldc)) {
                    Valu getField = puts.get(other);
                    if (getField == null) {
                        multipliers.mulX.put(put.name, Mul.enc(n));
                    } else {
                        multipliers.decEncX.add(new FieldMulAssign(put.name, getField.name, n));
                    }
                }
                if (value.isMul()) {
                    return;
                }
            }
            if (a instanceof Valu.Two) {
                distribute(put, (Valu.Two) a);
            }
            if (b instanceof Valu.Two) {
                distribute(put, (Valu.Two) b);
            }
        }

        private FieldMul asFieldMul(Valu.Two value) {
            Valu ldc = null;
            Valu get = null;
            if (value.a.isLdcInt() && value.b.isGetField()) {
                ldc = value.a;
                get = value.b;
            } else if (value.b.isLdcInt() && value.a.isGetField()) {
                ldc = value.b;
                get = value.a;
            }
            if (ldc != null && get != null) {
                if (isMultiplier(ldc.ldcNum())) return new FieldMul(get, ldc);
            }
            return null;
        }

        private boolean isLdcInt() {
            AbstractInsnNode insn = v.insn;
            return insn != null && insn instanceof LdcInsnNode && (insn.cst instanceof Integer || insn.cst instanceof Long);
        }

        private AbstractInsnNode insn() {
            return insns.get(0);
        }

        private boolean isGetField() {
            AbstractInsnNode insn = v.insn;
            return insn != null && (insn.getOpcode() == Opcodes.GETSTATIC || insn.getOpcode() == Opcodes.GETFIELD);
        }

        private Number ldcNum() {
            return ((LdcInsnNode) v.insns.get(0)).cst instanceof Number ? (Number) ((LdcInsnNode) v.insns.get(0)).cst : null;
        }

        private String fieldName() {
            FieldInsnNode insn = (FieldInsnNode) v.insns.get(0);
            return insn.owner + "." + insn.name;
        }

        private boolean isMul() {
            AbstractInsnNode insn = v.insn;
            return insn != null && (insn.getOpcode() == Opcodes.IMUL || insn.getOpcode() == Opcodes.LMUL);
        }

        private boolean isAdd() {
            AbstractInsnNode insn = v.insn;
            return insn != null && (insn.getOpcode() == Opcodes.IADD || insn.getOpcode() == Opcodes.LADD || insn.getOpcode() == Opcodes.ISUB || insn.getOpcode() == Opcodes.LSUB);
        }

        private static class FieldMul {
            Valu f;
            Valu ldc;

            FieldMul(Valu f, Valu ldc) {
                this.f = f;
                this.ldc = ldc;
            }
        }
    }

    private boolean isMultiplier(Number n) {
        return MultiplierFinderUtilities.isInvertible(n) && !MultiplierFinderUtilities.invert(n).equals(n);
    }

    private static abstract class Valu implements Value {

        private final SourceValue v;

        Valu(SourceValue value) {
            v = value;
        }

        @Override
        public boolean equals(Object other) {
            return other instanceof Valu && v.equals(((Valu) other).v);
        }

        @Override
        public int hashCode() {
            return v.hashCode();
        }

        @Override
        public int getSize() {
            return v.getSize();
        }

        static class Two extends Valu {

            final Valu a;
            final Valu b;

            Two(SourceValue value, Valu a, Valu b) {
                super(value);
                this.a = a;
                this.b = b;
            }
        }
    }

    @Getter
    private static class Mul {

        final boolean dec;
        final Number n;
        final Number decoder;

        Mul(boolean dec, Number n) {
            this.dec = dec;
            this.n = n;
            decoder = dec ? n : MultiplierFinderUtilities.invert(n);
        }

        static Mul dec(Number n) {
            return new Mul(true, n);
        }

        static Mul enc(Number n) {
            return new Mul(false, n);
        }
    }

    private static class FieldMulAssign {

        final String put;
        final String get;
        final Number mul;

        FieldMulAssign(String put, String get, Number mul) {
            this.put = put;
            this.get = get;
            this.mul = mul;
        }
    }
}
