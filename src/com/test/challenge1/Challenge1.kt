package com.test.challenge1

import java.util.*


//Declare two immutable String variables called hello and hello1
//Assign "Hello to both variables"

fun main(args: Array<String>) {
    val hello1 = "hello"
    val hello2 = "hello"

    //Check if hello1 is referentially equal to hello2
    println("hello1 is referentailly equal to hello2 :  ${hello1 === hello2}")

    //Check if hello1 and hello2 are structurally equal
    println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

    //Declare mutable variable of type int and assign it value 2988
    var value: Int = 2988
    value = 2
    println("Var is $value")
    // Declare immutalbe variable of type Any and assign it the string "The Any type is the root of Kotln class hierarchy"
    //Using smart cast, print out the  Uppercased String
    val anyVar: Any = "The any type is the root of Kotlin class hierarchy"

    if (anyVar is String) {
        println(anyVar.toUpperCase())
    }

    //Print
    //    1
    //   11
    //  111
    /// 1111

    println(
        """1
        |11
        |111
        |1111
    """.trimMargin()
    )
}



