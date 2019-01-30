data class MyDate(
        val year: Int,
        val month: Int,
        val dayOfMonth: Int
) : Comparable<MyDate> {
    override operator fun compareTo(other: MyDate): Int = when{
        other.year != year -> year - other.year
        other.month != month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
