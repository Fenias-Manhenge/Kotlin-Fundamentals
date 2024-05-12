package org.example.collectionsOverview

fun main(){

    val list = listOf(1, 2, 3, 4, 5, 6, 3, 9, 3)

    println("\n" + list)

    println("\nShuffled")
    val shuffle = list.shuffled()
    println(shuffle)

    println("\nSorted:\n" + list.sorted().toSet())
    println("Descending:\n" + list.sortedDescending().toSet())

    println(list.lastIndex)
    println(list[3])
    println(list.indexOf(5))
    println(list.lastIndexOf(4))

    if (list.contains(5))
        println("5 exists in the list!")

}