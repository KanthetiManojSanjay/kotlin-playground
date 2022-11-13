package com.learning.basics

/**
 * @author kansanja on 12/11/22.
 */

fun main() {
    for (i in 1..5) {
        println("i in $i")
        if (i == 3) break
    }

    label()

    // will return when i=3 and doesn't execute anything below as it comes out of main function
    for (i in 1..5) {
        println("i in return is : $i")
        if (i == 3) return
    }

    println("End of the program!!")
}

fun label() {
    /* loop@ for (i in 1..5) {
         println("i in label is :$i")
         if (i == 3) break@loop
     }
 */
    loop@ for (i in 1..5) {
        println("i in label is :$i")
        innerloop@ for (j in 1..5) {
            println("j in label is : $j")
//            if (j == 2) break@innerloop
            if (j == 2) continue@loop
        }
    }
}
