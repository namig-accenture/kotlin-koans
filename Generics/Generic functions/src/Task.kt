import java.util.*

fun <T, MC : MutableCollection<T>> Collection<T>.partitionTo(
        positive: MC,
        negative: MC,
        block: (T) -> Boolean
): Pair<MC, MC> {
    forEach {
        if (block(it)) {
            positive.add(it)
        } else {
            negative.add(it)
        }
    }

    return Pair(positive, negative)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e").partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
    words == listOf("a", "c")
    lines == listOf("a b", "d e")
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}').partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    letters == setOf('a', 'r')
    other == setOf('%', '}')
}
