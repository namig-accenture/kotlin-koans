class DateRange(
        val start: MyDate,
        val end: MyDate
):Iterable<MyDate>{
    override fun iterator(): Iterator<MyDate> = object : Iterator<MyDate>{
        var current = start

        override fun hasNext(): Boolean {
            return current <= end
        }

        override fun next(): MyDate {
            val old = current
            val new = current.nextDay()
            current = new
            return old
        }
    }
}

fun iterateOverDateRange(
        firstDate: MyDate,
        secondDate: MyDate,
        handler: (MyDate) -> Unit
) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
