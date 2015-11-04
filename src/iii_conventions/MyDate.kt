package iii_conventions

class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (year != other.year) return year - other.year
        if (month != other.month) return month - other.month
        return dayOfMonth - other.dayOfMonth

    }

    override fun equals(other: Any?): Boolean {
        return compareTo(other as MyDate) == 0
    }
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class RepeatedTimeInterval(val ti: TimeInterval, val n: Int);

operator fun TimeInterval.times(timeNumber: Int) = RepeatedTimeInterval(this, timeNumber)

operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)
operator fun MyDate.plus(timeInterval: TimeInterval) = addTimeIntervals(timeInterval, 1)
operator fun MyDate.plus(repeatedTimeInterval: RepeatedTimeInterval)
        = addTimeIntervals(repeatedTimeInterval.ti, repeatedTimeInterval.n )

class DateRange(public override val start: MyDate, public override val end: MyDate) : Iterable<MyDate>, Range<MyDate> {
    override fun contains(item: MyDate): Boolean = start <= item && item <= end

    override fun iterator(): Iterator<MyDate> = DateIterator(this)
}

class DateIterator(val dateRange: DateRange) : Iterator<MyDate> {
    var cursor: MyDate = dateRange.start

    override fun next(): MyDate {
        val current = cursor
        cursor = cursor.nextDay()
        return current
    }

    override fun hasNext(): Boolean = cursor <= dateRange.end
}