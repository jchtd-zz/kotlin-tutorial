package com.oracle.netsuite.jeck

import java.time.LocalDate

fun ifElseCondition(){
    val dateNow: LocalDate = today()
    val typeInitializedBoolean: Boolean // this is better if you're declaring the variable first but not assigning it a value
    var typeInitializedString: String  // i.e. to be assigned later, so developer does not forget its intended data type
    val isLeapYear: Boolean = dateNow.isLeapYear
    if(isLeapYear) {
        typeInitializedBoolean = true
        typeInitializedString = "A"
    } else {
        typeInitializedBoolean = false
        typeInitializedString = "B"
    }

    println("is leap year? $typeInitializedBoolean")
}

fun whenCondition(){
    val dateNow: LocalDate = today()
    val isLeapYear: Boolean = dateNow.isLeapYear

    val typeInitializedBoolean: Boolean // this is better if you're declaring the variable first but not assigning it a value
    var typeInitializedString: String

    when(isLeapYear){
        true -> {
            typeInitializedBoolean = true
            typeInitializedString = "A"
        }
        else -> {
            typeInitializedBoolean = false
            typeInitializedString = "B"
        }
    }

    println("is leap year? $typeInitializedBoolean")
}


/**
 * If the conditions return a single variable, it can be simplified to expressions
 */
fun simpleCondition(){
    val dateNow: LocalDate = today()
    val isLeapYear: Boolean = dateNow.isLeapYear
    val daysInYear: Int = if(isLeapYear) 366 else 365

    println("there are $daysInYear days this year")

    val daysInYear2 = when(isLeapYear){
        true -> 366
        else -> 365
    }

    println("again, there are $daysInYear days this year")
}

fun forLoops(){
    val myNumbers = setOf(2,3,4,6,8,10,22,30,31)
    for(theNumber in myNumbers){
        println(theNumber)
    }
}

fun forEachLoops(){
    val myNumbers = setOf(2,3,4,6,8,10,22,30,31)
    myNumbers.forEach { it -> println(it) }
}

fun whileAndDoWhileLoops(){
    var myNumber = 5
    while(myNumber > 0){
        myNumber--
        println(myNumber)
    }

    do {
        myNumber++
        println(myNumber)
    } while (myNumber < 5)
}