package com.oracle.netsuite.jeck

import java.time.LocalDate

fun main(){
    // int a = 4
    val a: Int = 4
    val b = 5 // type inference
    val c = "A"
//    a = 7 // vals are immutable and cannot be changed

    var d = true // var are mutable and can be changed anytime
//    d = "a" // mismatch due to inference
    d = false

    var e = "hello world"
    e = e.toUpperCase()
    e = e.toLowerCase()

    val f: LocalDate = LocalDate.now()
    val h: Boolean // this is better if you're declaring the variable first but not assigning it a value
    var i: String  // i.e. to be assigned later, so developer does not forget its intended data type
    if(f.isLeapYear) {
        h = true
        i = "A"
    } else {
        h = false
        i = "B"
    }

    e = "hello world $a"

    println(e)
}