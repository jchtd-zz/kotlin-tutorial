package com.oracle.netsuite.jeck

import java.lang.NullPointerException
import java.math.BigDecimal
import java.time.LocalDate

fun basicInt() {
    println("int")
    val basicInt: Int = 4
    val basicIntNoTypeDeclaration = 5 // type inference

    val basicIntUndeclared: Int
//    basicIntUndeclared = "A" // error due type mismatch

    println(basicInt)
}

fun moreReadableInt() {
    println("readable int")
    // you can write underscores for numbers to make it more readable, but underlying value is the same as 4 million
    val underscoredNumberIsStillNumber: Int = 4_000_000
    println("there are $underscoredNumberIsStillNumber reasons why things are like this")
}

fun basicChar() {
    println("char")
    val a: Char = 'a' // use single quote for char
    println(a)
    val b: Char = a.inc() // can increment
    println(b)
    val c = b.inc().inc().dec()
    println(c)
}

fun basicString() {
    println("string")
    var basicString: String = "He was the impostor among us"
    println(basicString)
    basicString = basicString.toUpperCase()
    println(basicString)
    basicString = basicString.toLowerCase()
    println(basicString)
}

fun basicBoolean() {
    println("boolean")
    var basicBoolean = true // vars are mutable and can be changed anytime
    basicBoolean = false

    println(basicBoolean)
}

fun today(): LocalDate {
    println("local date")
    val today: LocalDate = LocalDate.now()
    println(today.toString())
    return today
}

fun javaBigDecimals(){
    println("java bigdecimal")
    // has other number types such as float, double and long (long int)
    // can also use Java's BigDecimal for more precision
    val bigDecimalTen = BigDecimal.TEN
    val bigDecimalOfNumber = BigDecimal(88.554423)

    println("$bigDecimalOfNumber and $bigDecimalTen" )
}

fun nullables(){
    println("nullable")
    // without typecasting, you initialize a variable to null
    val basicString = null
    var basicString2 = "A"
//    basicString2 = null // error

    // with typecasting, variables cannot be null
//    val basicStringType: String = null // error

    // but there are ways to make it nullable
    val basicStringTypeNullable: String? = null
    // ^ by adding ?

}

fun forceNonNullables() {
    println("!!")
    val nullableVariable: String? = if(!today().isLeapYear) "not a leap year" else null

    // some of your variables will be null on some conditions, by adding !! you are guaranteeing that the variable is
    // not null, and you risk encountering NPEs
    // sample use case, you are sure that the variable won't be null for that branch.
    try {
        val nonNullableVariable: String = nullableVariable!!
    } catch(e: NullPointerException) {
        println("oops, null!")
    }


}