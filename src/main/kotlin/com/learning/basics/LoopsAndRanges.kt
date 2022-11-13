package com.learning.basics

/**
 * @author kansanja on 12/11/22.
 */

fun main() {
    /* val range = 1..10
     for (i in range) {
         println("The value of i is : $i")
     }

     val reverseRange = 10 downTo 1
     for (i in reverseRange step 2) {
         println("Reverse range with skip is $i")
     }

 */
    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("The value of i in doWhile is : $i")
        i++
    } while (i < 5)
}

fun exploreWhile() {
    var x = 1
    while (x < 5) {
        println("Value of x is $x")
        x++
    }
}
