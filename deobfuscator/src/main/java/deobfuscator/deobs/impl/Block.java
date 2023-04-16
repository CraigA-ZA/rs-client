package deobfuscator.deobs.impl;

import java.util.ArrayList;

public class Block {

    // inclusive
    public int instructionsStart = 0;

    // exclusive
    public int instructionsEnd = 0;

    public Block immediateSuccessor = null;

    Block immediatePredecessor = null;

    public Block getImmediateOrigin() {
        Block b = this;
        Block pred = immediatePredecessor;
        while (pred != null) {
            b = pred;
            pred = b.immediatePredecessor;
        }
        return b;
    }

    public ArrayList<Block> branchSuccessors = new ArrayList<>();
}