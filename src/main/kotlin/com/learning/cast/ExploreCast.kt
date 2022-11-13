package com.learning.cast

import com.learning.classes.Course

/**
 * @author kansanja on 13/11/22.
 */

fun main() {

    val course = Course(1, "Reactive Programming", "Sanjay")
    checkType(course)
    checkType("SANJAY")
    castNumber(1.0)
//    castNumber(1)

    val number = 1
    val numberToDouble = number.toDouble()
    castNumber(numberToDouble)

}

fun castNumber(any: Any) {
    when (any) {
        // casted manually from Any to Double
        any as Double -> println("Value is Double")

    }
}

fun checkType(type: Any) {
    when (type) {

        // Type check
        is Course -> {
            println(type)
        }

        is String -> {
            // smartcast from Any to String bydefault here
            println(type.lowercase())

        }

    }

}
