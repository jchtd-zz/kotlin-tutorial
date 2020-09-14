package com.oracle.netsuite.jeck

import java.time.LocalDate

fun ifElseCondition(){
    println("if-else")
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
    println("when")
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
fun simplifiedCondition(){
    println("simplified conditions")
    val dateNow: LocalDate = today()
    val isLeapYear: Boolean = dateNow.isLeapYear
    val daysInYear: Int = if(isLeapYear) 366 else 365

    println("there are $daysInYear days this year")

    val daysInYear2 = when(isLeapYear){
        true -> 366
        else -> 365
    }

    println("again, there are $daysInYear2 days this year")
}

fun basicForLoop(){
    println("for")
    val myNumbers = setOf(2,3,4,6,8,10,22,30,31)
    for(theNumber in myNumbers){
        println(theNumber)
    }
}

fun iterativeForLoops(){
    println("iterative for")
    /** Iterates over a range starting from 0 up to 3 (inclusive)  **/
    for (i in 0..3) {
        print(i)
    }
    print(" ")

    /** iterates over a range with a custom increment step for consecutive elements **/
    for(i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    /** Iterates over a range in reverse order (downTo) **/
    for (i in 3 downTo 0) {
        print(i)
    }
    print(" ")

    /** Iterates over a char range in alphabetical order **/
    for (c in 'a'..'d') {
        print(c)
    }
    print(" ")

    /** Char ranges support 'step' and 'downTo' as well **/
    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    println(" ")
}

fun forEachLoops(){
    println("forEach")
    val myNumbers = setOf(2,3,4,6,8,10,22,30,31)
    myNumbers.forEach { it -> println(it) }
}

fun whileAndDoWhileLoops(){1
    println("while/do-while")
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