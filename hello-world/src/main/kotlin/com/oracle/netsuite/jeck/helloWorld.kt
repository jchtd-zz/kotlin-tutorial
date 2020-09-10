package com.oracle.netsuite.jeck

import java.math.BigDecimal
import java.time.LocalDate

fun main(){
    val basicInt: Int = 4
    val basicIntNoTypeDeclaration = 5 // type inference
    val basicString = "A"
//    basicInt = 7 // vals are immutable and cannot be changed

    var basicBoolean = true // var are mutable and can be changed anytime
//    basicBoolean = "a" // mismatch due to inference (basicBoolean is of boolean type)
    basicBoolean = false

    var helloWorldString = "hello world"
    println(helloWorldString)
    helloWorldString = helloWorldString.toUpperCase()
    helloWorldString = helloWorldString.toLowerCase()

    val dateNow: LocalDate = LocalDate.now()
    val typeInitializedBoolean: Boolean // this is better if you're declaring the variable first but not assigning it a value
    var typeInitializedString: String  // i.e. to be assigned later, so developer does not forget its intended data type
    if(dateNow.isLeapYear) {
        typeInitializedBoolean = true
        typeInitializedString = "A"
    } else {
        typeInitializedBoolean = false
        typeInitializedString = "B"
    }

    helloWorldString = "$helloWorldString $basicInt."

    val underscoredNumberIsStillNumber = 4_000_000 // you can use underscores for numbers to make it more readable, but underlying value is the same as 4 million

    helloWorldString = "$helloWorldString there are $underscoredNumberIsStillNumber reasons why things are like this"
    println(helloWorldString)

    // has other number types such as float, double and long (long int)
    // can also use Java's BigDecimal for more precision
    val bigDecimalTen = BigDecimal.TEN
    val bigDecimalOfNumber = BigDecimal(88.554423)

    // nulls - add ? to signify it's nullable
    val nullableString: String?
    // which means that all other variables declared so far were non-nullable.
//    underscoredNumberIsStillNumber = null // non-null error

    val listOfStrings: List<String> = listOf() // empty list, since this is val, it's gonna be an empty list
    val listOfWhatevers: List<Any> = listOf() // Any is like an open data type, it can be anything. ---> THIS IS NOT A SUGGESTED PRACTICE.

    // we want to have the ability to add values to it down the line. can we use var list? NO. It would be like replacing the list everytime.
    // There is another way: mutableList
    // There are two ways to define lists (and sets):
    val mutableListOfStrings: MutableList<String> = mutableListOf()
    val mutableListOfString2 = mutableListOf<String>()

    mutableListOfStrings.add("A")
    println("The first element is ${mutableListOfStrings[0]}") // if the variable is not one word (such as list[i]), enclose this in curly braces
}
