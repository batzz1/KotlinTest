package datatypes

import java.lang.StringBuilder

fun main() {
    val myInt = 10
    val myShort: Short = 22
    val myLong = 22L
    var myDouble = myLong.toInt()

    val char = 'b'
    val myChar = 65
    if(myChar is Int){
        print("\ntrue\n")
    }
    val myCharInt = 65
    println(myCharInt.toChar())



}