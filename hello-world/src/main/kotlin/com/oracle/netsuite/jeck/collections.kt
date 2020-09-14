package com.oracle.netsuite.jeck

fun lists() {
    println("list")
    // immutable
    val listOfStrings: List<String> = listOf() // empty list, since this is val, it's gonna be an empty list
    val listOfWhatevers: List<Any> = listOf() // Any is like an open data type, it can be anything. ---> THIS IS NOT A SUGGESTED PRACTICE.

    // if we want to have the ability to add values to it down the line. can we use var list? NO. It would be like replacing the list every time.
    // There is another way: mutableList

    // mutable
    val mutableListOfStrings: MutableList<String> = mutableListOf()
    val mutableListOfString2 = mutableListOf<String>()

    // sample
    val sampleList = listOf("a", "b", "c", "d")

    // sample mutable
//    sampleList.add -- error because sampleList is immutable
    val sampleMutableList = mutableListOf<String>()
    sampleMutableList.add("z")
    // can also add a list of values to another list via addAll
    sampleMutableList.addAll(sampleList)
    println(sampleMutableList[0])
}

/**
 * Sets are like lists but ordering is not important
 */
fun sets(){
    println("set")
    // immutable
    val setOfStrings: Set<String> = setOf() // empty list, since this is val, it's gonna be an empty list
    val setOfWhatevers: Set<Any> = setOf() // Any is like an open data type, it can be anything. ---> THIS IS NOT A SUGGESTED PRACTICE.

    // mutable
    val mutableSetOfStrings: MutableSet<String> = mutableSetOf()
    val mutableSetOfString2 = mutableSetOf<String>()

    // sample + comparing to list
    val aList = listOf(1,2,3,4)
    val anotherList = listOf(4,3,2,1)
    val areListsEqual = aList == anotherList
    println("are the lists equal? $areListsEqual")

    val aSet = setOf(1,2,3,4)
    val anotherSet = setOf(1,2,3,4)
    val areSetsEqual = aSet == anotherSet
    println("are the sets equal? $areSetsEqual")
}

/**
 * maps are key value pair lists
 */
fun maps() {
    println("map")
    // immutable
    val mapOfStrings: Map<String, String> = mapOf() // empty list, since this is val, it's gonna be an empty list
    val mapOfWhatevers: Map<Any, Any> = mapOf() // Any is like an open data type, it can be anything. ---> THIS IS NOT A SUGGESTED PRACTICE.

    // mutable
    val mutableMapOfStrings: MutableMap<String, String> = mutableMapOf()
    val mutableMapOfString2 = mutableMapOf<String, String>()

    // sample
    val alphabetDescription = mapOf<String, String>(
            "A" to "Apple",
            "B" to "Ball"
    )
    val allAlphabetDescription: MutableMap<String, String> = mutableMapOf(
            "C" to "Carrot"
    )
    allAlphabetDescription["D"] = "Duck"
    allAlphabetDescription.putAll(alphabetDescription)

    println(allAlphabetDescription["A"])
}
