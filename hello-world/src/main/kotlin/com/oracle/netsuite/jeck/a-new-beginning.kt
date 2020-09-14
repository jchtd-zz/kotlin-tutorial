package com.oracle.netsuite.jeck

import java.math.BigDecimal
import java.time.LocalDate

fun main(){
    val basicInt = basicInt()

    var helloWorldString = "hello world"
    println(helloWorldString)
    helloWorldString = helloWorldString.toUpperCase()
    helloWorldString = helloWorldString.toLowerCase()


    helloWorldString = "$helloWorldString $basicInt."
    println(helloWorldString)

    val underscoredNumberIsStillNumber = moreReadableInt()
    helloWorldString = "$helloWorldString there are $underscoredNumberIsStillNumber reasons why things are like this"
    println(helloWorldString)


}
