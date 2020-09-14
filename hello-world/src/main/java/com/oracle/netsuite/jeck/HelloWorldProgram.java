package com.oracle.netsuite.jeck;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HelloWorldProgram { //needs to be wrapped in a class for main
    public static void main(String[] args){
        int basicInt = 4; // need to have semicolons
        var basicIntNoTypeDeclaration = 4; // has type inference starting Java 10, not possible in 1.8
        String basicString = "A";
        basicInt = 7; // by default variables are mutable
        final String immutableVariable = "X"; // an immutable variable must have final
//        immutableVariable = "Y"; // error because this is immutable

        var basicBoolean = true;
//        basicBoolean = "a" // mismatch due to inference (basicBoolean is of boolean type)
        basicBoolean = false;

        var helloWorldString = "hello world";
        System.out.println(helloWorldString);
        helloWorldString = helloWorldString.toUpperCase();
        helloWorldString = helloWorldString.toLowerCase();

        LocalDate dateNow = LocalDate.now();
        boolean typeInitializedBoolean; // this is better if you're declaring the variable first but not assigning it a value
        String typeInitializedString;   // i.e. to be assigned later, so developer does not forget its intended data type
        if(dateNow.isLeapYear()) {
            typeInitializedBoolean = true;
            typeInitializedString = "A";
        } else {
            typeInitializedBoolean = false;
            typeInitializedString = "B";
        }

        helloWorldString = helloWorldString + " " + basicInt + ".";

        System.out.println(helloWorldString);

        var underscoredNumberIsStillNumber = 4_000_000; // you can use underscores for numbers to make it more readable, but underlying value is the same as 4 million

        helloWorldString = helloWorldString + " there are " + underscoredNumberIsStillNumber + " reasons why things are like this";
        System.out.println(helloWorldString);

        BigDecimal bigDecimalTen = BigDecimal.TEN;
        BigDecimal bigDecimalOfNumber = new BigDecimal("88.554423");

        String nullableString; // no null-checking

        String[] listOfStrings = {}; // empty list, since this is val, it's gonna be an empty list
//        String[] listOfWhatevers = {}; // Any is like an open data type, it can be anything. ---> THIS IS NOT A SUGGESTED PRACTICE.
//        String[] mutableListOfStrings = {};
//        String[] mutableListOfString2 = {};


    }
}
