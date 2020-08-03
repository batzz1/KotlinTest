package arrays

import java.math.BigDecimal

fun main() {
    val names = arrayOf("John", "Dendi", "Josh", "Pam")

    for (name in names) {
        // println(name)
    }

    val longArray = arrayOf(1L, 3L, 4L, 5L)
    for (long in longArray) {
        // println(long)
    }

    val evenNumbers = Array(16) { i -> i * 2 }
    for (arr in evenNumbers) {
        //println(arr)
    }

    val allZeroes = Array(100) { 0 }
    for (zero in allZeroes) {
        //println(zero)
    }
    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)

    for (number in someArray) {
        // println(number)
    }

    someArray = Array(6) { i -> (i + 1) * 10 }
    for (number in someArray) {
        // println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(11.5), 'a')
    for (element in mixedArray) {
        println(element)
    }
    println(mixedArray is Array<Any>)

    val myIntArray = arrayOf(3, 4, 5, 6, 7, 8)


}