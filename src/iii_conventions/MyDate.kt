package iii_conventions

import iv_properties.toMillis

class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return (this.toMillis() - other.toMillis()).toInt()
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

class DateRange(public val start: MyDate, public val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = DateIterator(this)
}

class DateIterator(val dateRange: DateRange) : Iterator<MyDate> {
    var cursor: MyDate = dateRange.start

    override fun next(): MyDate {
        val current = cursor
        cursor = cursor.nextDay()
        println("current : ${current.year}.${current.month}.${current.dayOfMonth}")
        return current
    }

    override fun hasNext(): Boolean = cursor <= dateRange.end
}
