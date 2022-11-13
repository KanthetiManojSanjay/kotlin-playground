package com.learning.functions

import java.time.LocalDate

/**
 * @author kansanja on 13/11/22.
 */

fun main() {
    // If method doesnt return any value then the default returnType is Unit
    val result = printName("Sanjay")
    println("Print result is $result")
    personDetails("Sanjay", "abc@gmail.com", LocalDate.parse("2020-01-23"))
    personDetails("Sanjay")
    personDetails(dob = LocalDate.parse("2000-01-08"), name = "Sanjay")
}

fun printName(name: String) {
    println("Name is : $name")
    val result = addition(1, 2)
    println("Result is : $result")

    val result1 = addition1(1, 2)
    println("Result is : $result1")
}

// function as expression
fun addition1(x: Int, y: Int) = x + y

fun addition(x: Int, y: Int): Int {
    return x + y
}


fun personDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
) {

    println("Name is :$name and email is: $email and the dob is $dob")
}