package com.oracle.netsuite.jeck

import java.math.BigDecimal
import java.time.LocalDate

fun main(){
    val basicInt = basicInt()

    var helloWorldString = "hello world"
    println(helloWorldString)
    helloWorldString = helloWorldString.toUpperCase()
    helloWorldString = helloWorldString.toLowerCase()

    val dateNow: LocalDate = today()
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
    println(helloWorldString)

    val underscoredNumberIsStillNumber = moreReadableInt()
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


}
