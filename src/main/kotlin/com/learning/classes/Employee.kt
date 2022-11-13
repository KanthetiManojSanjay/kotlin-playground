package com.learning.classes

/**
 * @author kansanja on 13/11/22.
 */
data class Employee(
    val id: Int,
    val name: String
) {
}

fun main() {
    val employee1 = Employee(1, "sanjay")
    println(employee1)

    val employee2 = Employee(1, "sanjay")
    println(employee2)

    println("${employee1 == employee2}")

    val employee3 = employee1.copy(2, "Vivek")
    println(employee3)
}