package com.learning.basics

import com.learning.functions.courseName
import com.learning.functions.topLevelFunction

/**
 * @author kansanja on 12/11/22.
 */

fun main() {
    val name: String = "Hello"
    println(name)
    //name = "World"

    var age: Int = 20
    println(age)
    age = age + 1
    println(age)

    val course = "Kotlin Spring"
    println("Course is $course and its length is ${course.length}")

    val multiline = """
        ABC
        DEF
    """.trimIndent()

    println(multiline)

    val num = topLevelFunction()
    println("Num value is $num")
    println("CourseName is $courseName")
}