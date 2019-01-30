import java.util.*

fun buildMap(
        block: HashMap<Int, String>.() -> Unit
): Map<Int, String> {
    val map = hashMapOf<Int, String>()
    map.block()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
