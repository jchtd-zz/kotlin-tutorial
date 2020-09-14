package com.oracle.netsuite.jeck

import java.time.LocalDate

fun basicInt(): Int {
    val basicInt: Int = 4
    val basicIntNoTypeDeclaration = 5 // type inference

    val basicIntUndeclared: Int
//    basicIntUndeclared = "A" // error due type mismatch

    return basicInt
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

fun nullables(){

    // without typecasting, you can set a variable to null
    val basicString = null

    // with typecasting, variables cannot be null
//    val basicStringType: String = null // error

    // but there are ways to make it nullable
    val basicStringTypeNullable: String? = null
    // ^ by adding ?

}