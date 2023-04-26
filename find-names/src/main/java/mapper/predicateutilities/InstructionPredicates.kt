package mapper.predicateutilities

import mapper.wrappers.InstructionWrapper

fun Predicate<InstructionWrapper>.skip(n: Int): Predicate<InstructionWrapper> {
    return { insn ->
        if (this(insn)) {
            if (n > 0) {
                repeat(n) { insn.next() }
            } else {
                repeat(-1 * n) { insn.prev() }
            }
            true
        } else {
            false
        }
    }
}

inline fun Predicate<InstructionWrapper>.nextIn(n: Int, crossinline other: Predicate<InstructionWrapper>): Predicate<InstructionWrapper> {
    return skip(n).and { it.exists }.and(other)
}

inline fun Predicate<InstructionWrapper>.next(crossinline other: Predicate<InstructionWrapper>): Predicate<InstructionWrapper> {
    return nextIn(1, other)
}

inline fun Predicate<InstructionWrapper>.prevIn(n: Int, crossinline other: Predicate<InstructionWrapper>): Predicate<InstructionWrapper> {
    return skip(-1 * n).and { it.exists }.and(other)
}

inline fun Predicate<InstructionWrapper>.prev(crossinline other: Predicate<InstructionWrapper>): Predicate<InstructionWrapper> {
    return prevIn(1, other)
}

inline fun Predicate<InstructionWrapper>.nextWithin(n: Int, crossinline other: Predicate<InstructionWrapper>): Predicate<InstructionWrapper> {
    return object : Predicate<InstructionWrapper> {
        override fun invoke(insn: InstructionWrapper): Boolean {
            if (this@nextWithin(insn)) {
                repeat(n) {
                    insn.next()
                    if (insn.exists && other(insn)) {
                        return true
                    }
                }
                return false
            } else {
                return false
            }
        }
    }
}

inline fun Predicate<InstructionWrapper>.prevWithin(n: Int, crossinline other: Predicate<InstructionWrapper>): Predicate<InstructionWrapper> {
    return object : Predicate<InstructionWrapper> {
        override fun invoke(insn: InstructionWrapper): Boolean {
            if (this@prevWithin(insn)) {
                repeat(n) {
                    insn.prev()
                    if (insn.exists && other(insn)) {
                        return true
                    }
                }
                return false
            } else {
                return false
            }
        }
    }
}