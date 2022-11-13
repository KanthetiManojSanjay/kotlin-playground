package com.learning.functions

/**
 * @author kansanja on 13/11/22.
 */

const val courseName = "Kotlin Programming"

fun main() {
    val num = topLevelFunction()
    println("Num value is $num")
}


fun topLevelFunction(): Int {
    return (0..100).random()
}