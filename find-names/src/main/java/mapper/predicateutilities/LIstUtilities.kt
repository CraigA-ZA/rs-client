package org.runestar.client.common;

fun <T> List<T>.startsWith(elements: List<T>): Boolean {
    return subListTake(elements.size) == elements
}

fun <T> List<T>.subListTake(n: Int): List<T> {
    requireNotNegative(n)
    if (n >= size) return this
    return subList(0, n)
}

fun <T> List<T>.startsWith(vararg elements: T): Boolean {
    return startsWith(elements.asList())
}

fun <T> List<T>.endsWith(elements: List<T>): Boolean {
    return subListTakeLast(elements.size) == elements
}

fun <T> List<T>.subListTakeLast(n: Int): List<T> {
    requireNotNegative(n)
    if (n >= size) return this
    return subList(size - n, size)
}

fun requireNotNegative(n: Int) {
    if (n < 0) throw IllegalArgumentException("Argument was $n but must not be negative")
}