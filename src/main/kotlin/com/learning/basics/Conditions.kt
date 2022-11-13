package com.learning.basics

/**
 * @author kansanja on 12/11/22.
 */

fun main() {

    var name = "Alex"
    //name = "Chole"

    // if-else block is an expression in kotlin
    val result = if (name.length == 4) {
        println("Name is Four characters")
        name.length
    } else {
        println("Name is not four characters")
        name.length
    }

    println("Result is $result")


    var pos = 1;
    val medal = if (pos == 1) {
        "GOLD"
    } else if (pos == 2) {
        "SILVER"
    } else if (pos == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }

    println("Medal is $medal")


    var pos1 = 2;
    val medal1 = when (pos1) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println("Medal in when expression is $medal1")
}