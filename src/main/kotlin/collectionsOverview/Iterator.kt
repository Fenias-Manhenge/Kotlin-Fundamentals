package org.example.collectionsOverview

fun main(){

    val list = listOf(1, 2, 3, 4, 5)

    /*
    // Iterator
    val iterator = list.iterator()

    while (iterator.hasNext()){
        //print("${listIterator.next()}, ")
    }
    // Iterator

     */

    // List Iterator

    val listIterator = list.listIterator()

    /*
    while (listIterator.hasNext())
        listIterator.next()

    while (listIterator.hasPrevious()){
        println("Index: ${listIterator.previousIndex()}, value: ${listIterator.previous()}")
    }
     */

    // Mutable iterators

    val mIterator = (1..10 step 2).toMutableList()

    val mutableIterator = mIterator.listIterator()

    while (mutableIterator.hasNext()){
        mutableIterator.next()
        if (mutableIterator.nextIndex() == 4)
            mutableIterator.set(4)
    }

    println(mIterator)
    mIterator.forEach { print("$it, ") }
}