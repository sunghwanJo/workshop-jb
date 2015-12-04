package i_introduction._4_Lambdas

import util.*

fun example() {

    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { x -> x * x }

    sum(1, square(2)) == 5
}

fun todoTask4(collection: Collection<Int>): Nothing = TODO(
    """
        Task 4.
        Rewrite 'JavaCode4.task4()' in Kotlin using lambdas.
        You can find the appropriate function to call on 'collection' through IntelliJ's code completion feature.
        (Don't use the class 'Iterables').
    """,
    documentation = doc4(),
    references = { JavaCode4().task4(collection) })

<<<<<<< HEAD
fun task3(collection: Collection<Int>): Boolean {
    return collection.any { it%42==0 }
}
=======
fun task4(collection: Collection<Int>): Boolean = todoTask4(collection)
>>>>>>> 350fc69a6a89148f21ace7bb429e7d3d60987881




