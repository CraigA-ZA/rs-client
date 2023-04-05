package deobfuscator.utilities;

import org.objectweb.asm.tree.*;

public class Searcher {

    public static int WILDCARD = -1337;
    public static int IF = -13377;
    public static int CONSTPUSH = -133777;
    public static int SHORTIF = -133433;

    /**
     * Finds a pattern of instructions in an instruction list.
     *
     * @param pattern  the pattern to search for
     * @param count    the number of times the pattern should occur
     * @param insnList the instruction list to search in
     * @return the index of the first occurrence of the pattern, or -1 if not found
     */
    public static int findPattern(int[] pattern, int count, InsnList insnList) {
        AbstractInsnNode[] instructions = insnList.toArray();
        int occurrenceCount = 0;

        for (int i = 0, j = 0; i < instructions.length; ++i) {
            int currentPatternIndex = j; //ie what instruction in the pattern are we searching for
            int currentInstructionIndex = i; //ie what instruction in the bytecode are we looking at

            // While the current instruction matches the current pattern or is a wildcard,
            // or the current pattern is a special case and the current instruction matches the special case,
            // continue checking the next instruction and pattern.
            while (matchesPattern(pattern, instructions, currentPatternIndex, currentInstructionIndex)) {
                ++currentInstructionIndex;
                ++currentPatternIndex;

                // If we've reached the end of the instruction list, we can't find the pattern.
                if (currentInstructionIndex >= instructions.length)
                    break;

                // If the next instruction is a label, skip it.
                if (instructions[currentInstructionIndex].getOpcode() == -1)
                    ++currentInstructionIndex;

                // If we've found the pattern, return the index of the first instruction in the pattern.
                if (currentPatternIndex == pattern.length) {
                    if (occurrenceCount == count)
                        return i;
                    else {
                        ++occurrenceCount;
                        break;
                    }
                }

                // If we've reached the end of the pattern but haven't found it the required number of times, keep searching.
                if (currentInstructionIndex == instructions.length) {
                    if (occurrenceCount == count)
                        return j;
                    else {
                        ++occurrenceCount;
                        break;
                    }
                }
            }
        }
        return -1;
    }

    /**
     * Determines whether the given instruction matches the given pattern.
     *
     * @param pattern          the pattern to check against
     * @param instructions     the instructions to check
     * @param patternIndex     the index of the current pattern instruction
     * @param instructionIndex the index of the current instruction
     * @return true if the instruction matches the pattern, false otherwise
     */
    private static boolean matchesPattern(int[] pattern, AbstractInsnNode[] instructions, int patternIndex, int instructionIndex) {
        AbstractInsnNode currentInstruction = instructions[instructionIndex];
        int currentPatternOpcode = pattern[patternIndex];
        if (currentInstruction.getOpcode() == currentPatternOpcode || currentPatternOpcode == WILDCARD)
            return true;
        if (currentPatternOpcode == IF && currentInstruction.getOpcode() > 158 && currentInstruction.getOpcode() < 167)
            return true;
        if (currentPatternOpcode == CONSTPUSH && currentInstruction.getOpcode() > 0 && currentInstruction.getOpcode() < 18)
            return true;
        if (currentPatternOpcode == SHORTIF && currentInstruction.getOpcode() > 152 && currentInstruction.getOpcode() < 159)
            return true;

        return false;
    }
}

