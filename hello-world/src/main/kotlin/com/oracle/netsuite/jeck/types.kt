package com.oracle.netsuite.jeck

import java.math.BigDecimal
import java.time.LocalDate

fun basicInt() {
    val basicInt: Int = 4
    val basicIntNoTypeDeclaration = 5 // type inference

    val basicIntUndeclared: Int
//    basicIntUndeclared = "A" // error due type mismatch

    println(basicInt)
}

fun moreReadableInt(): Int {
    // you can write underscores for numbers to make it more readable, but underlying value is the same as 4 million
    return 4_000_000
}

fun basicString(): String {
    return "A"
}

fun basicBoolean(): Boolean {
    var basicBoolean = true // vars are mutable and can be changed anytime
    basicBoolean = false

    return basicBoolean
}

fun today(): LocalDate {
    return LocalDate.now()
}

// and other
fun javaBigDecimals(){
    // has other number types such as float, double and long (long int)
    // can also use Java's BigDecimal for more precision
    val bigDecimalTen = BigDecimal.TEN
    val bigDecimalOfNumber = BigDecimal(88.554423)
}

fun nullables(){

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