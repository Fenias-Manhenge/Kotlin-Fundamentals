package org.example.collectionsOverview

fun main(){

    val list = listOf(1, 2, 3, 4, 5, 6, 3, 9, 3)

    /*
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
     */

    // Copy Collection

    /*
    val mainList = mutableListOf(1, 2, 3, 4, 5, 6, 3, 9, 3)

    val copyList = mainList.toMutableList()

    mainList.add(6, 7)

    println("$mainList \n$copyList")
     */

    // Invoke functions on other collections

    val filterList = list.filter { it > 5 }

    println(filterList)
    println(list.associateWith { it.times(3)})
}