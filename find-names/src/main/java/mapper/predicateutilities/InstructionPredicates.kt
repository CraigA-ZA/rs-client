package mapper.predicateutilities

import mapper.wrappers.InstructionMapper

fun Predicate<InstructionMapper>.skip(n: Int): Predicate<InstructionMapper> {
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

inline fun Predicate<InstructionMapper>.nextIn(n: Int, crossinline other: Predicate<InstructionMapper>): Predicate<InstructionMapper> {
    return skip(n).and { it.exists }.and(other)
}

inline fun Predicate<InstructionMapper>.next(crossinline other: Predicate<InstructionMapper>): Predicate<InstructionMapper> {
    return nextIn(1, other)
}

inline fun Predicate<InstructionMapper>.prevIn(n: Int, crossinline other: Predicate<InstructionMapper>): Predicate<InstructionMapper> {
    return skip(-1 * n).and { it.exists }.and(other)
}

inline fun Predicate<InstructionMapper>.prev(crossinline other: Predicate<InstructionMapper>): Predicate<InstructionMapper> {
    return prevIn(1, other)
}

// todo
inline fun Predicate<InstructionMapper>.nextWithin(n: Int, crossinline other: Predicate<InstructionMapper>): Predicate<InstructionMapper> {
    return object : Predicate<InstructionMapper> {
        override fun invoke(insn: InstructionMapper): Boolean {
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

inline fun Predicate<InstructionMapper>.prevWithin(n: Int, crossinline other: Predicate<InstructionMapper>): Predicate<InstructionMapper> {
    return object : Predicate<InstructionMapper> {
        override fun invoke(insn: InstructionMapper): Boolean {
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