import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval {
    DAY, WEEK, YEAR;

    var times: Int = 1
        get() {
            val real = field
            field = 1
            return real
        }
        private set

    operator fun times(value: Int): TimeInterval{
        times = value
        return this
    }
}

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate {
    return addTimeIntervals(
            timeInterval = timeInterval,
            number = timeInterval.times
    )
}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}


fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
