package i_introduction._6_Data_Classes

import util.*

fun todoTask6(): Nothing = TODO(
    """
        Convert 'JavaCode6.Person' class to Kotlin.
        Then add an annotation `data` to the resulting class.
        This annotation means the compiler will generate a bunch of useful methods in this class: `equals`/`hashCode`, `toString` and some others.
        The `task6` function should return a list of persons.
    """,
    documentation = doc6(),
    references = { JavaCode6.Person("Alice", 29) }
)

data class Person(val name: String, val age: Int)

<<<<<<< HEAD
fun task7(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
=======
fun task6(): List<Person> {
    todoTask6()
    return listOf(/*Person("Alice", 29), Person("Bob", 31)*/)
>>>>>>> 350fc69a6a89148f21ace7bb429e7d3d60987881
}

