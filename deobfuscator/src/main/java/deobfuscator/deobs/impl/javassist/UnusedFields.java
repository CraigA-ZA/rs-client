package deobfuscator.deobs.impl.javassist;

import deobfuscator.Deobfuscator;
import deobfuscator.deobs.AbstractDeob;
import javassist.*;
import javassist.expr.ExprEditor;
import javassist.expr.FieldAccess;

import java.util.*;

public class UnusedFields extends AbstractDeob {
    static Set<CtField> usedFields = new HashSet<>();

    @Override
    public void run() {
        int removedCount = 0;
        findUsedFields();


        for (CtClass analysedClass : Deobfuscator.classMap.values()) {
            //This could be changed to all fields, not just declared
            //Im pretty sure that in this case I only want to look at declared ones.
            for (CtField ctField : analysedClass.getDeclaredFields()) {
                if (!usedFields.contains(ctField)) {
                    removedCount++;
                    //remove field
                    try {
                        analysedClass.removeField(ctField);
                    } catch (NotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        System.out.println("Unused fields: " + removedCount);;
    }

    private void findUsedFields() {
        for (CtClass analysedClass : Deobfuscator.classMap.values()) {
            //This could be changed to declaredmethods
            for (CtMethod ctMethod : analysedClass.getDeclaredMethods()) {

                try {
                    ctMethod.instrument(new ExprEditor() {
                        public void edit(FieldAccess f) {
                            try {
                                usedFields.add(f.getField());
                            } catch (NotFoundException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    });
                } catch (CannotCompileException e) {
                    throw new RuntimeException(e);
                }
            }


            List<CtConstructor> constructors = new ArrayList(Arrays.asList(analysedClass.getDeclaredConstructors()));
            CtConstructor initializer = analysedClass.getClassInitializer();
            if(initializer != null) {
                constructors.add(analysedClass.getClassInitializer());
            }

            for (CtConstructor ctMethod : constructors) {
                try {
                    ctMethod.instrument(new ExprEditor() {
                        public void edit(FieldAccess f) {
                            try {
                                usedFields.add(f.getField());
                            } catch (NotFoundException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    });
                } catch (CannotCompileException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
