package deobfuscator.deobs.impl;

import org.objectweb.asm.tree.AbstractInsnNode;

import java.util.ArrayList;
import java.util.List;

public class ASMBlock {
    public List<AbstractInsnNode> instructions = new ArrayList<>();
    public int index;
    public List<Integer> exits = new ArrayList<>();
    public List<Integer> incomings = new ArrayList<>();

    public void addInstruction(AbstractInsnNode instruction) {
        instructions.add(instruction);
    }

    public void addExit(int exit) {
        exits.add(exit);
    }

    public void addIncoming(int incoming) {
        incomings.add(incoming);
    }
}
