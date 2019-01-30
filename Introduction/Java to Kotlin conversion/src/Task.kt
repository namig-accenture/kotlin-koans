fun toJSON(collection: Collection<Int>): String = buildString {
    append("[")

    val iterator = collection.iterator()

    while (iterator.hasNext()){
        val element = iterator.next()
        append(element)
        if(iterator.hasNext()){
            append(", ")
        }
    }

    append("]")
}
