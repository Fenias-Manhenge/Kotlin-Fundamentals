package org.example.collectionsOverview

fun main(){

    //val map = mutableMapOf("Key1" to 1, "key2" to 2, "key3" to 3)

    val map = mutableMapOf<String, Int>().apply {
        this["Key1"] = 1; this["Key2"] = 2; this["Key3"] = 3
    }

    println("All keys ${map.keys}")
    println("All values ${map.values}")

    if (map.containsValue(3)) {
        val itKey = map.entries.find { it.value == 3 }?.key

        println("It key is $itKey")
    }

}