package com.learning.classes

/**
 * @author kansanja on 13/11/22.
 */
class Person(
    val name: String = "",
    val age: Int = 0
) {
    var email: String = ""
    var nameLength: Int

    init {
        println("Inside init block")
        nameLength = name.length
    }

    constructor(_email: String, _name: String, _age: Int) : this(_name, _age) {
        email = _email

    }

    fun action() {
        println("Person walks")

    }
}

fun main() {
    /*val person = Person("Sanjay", 20)
    person.action()
    println("Person is ${person.name} and his age is ${person.age}")

    val person2 = Person()
    person2.action()
    println("Person is ${person2.name} and his age is ${person2.age}")*/

    val person3 = Person("abc@gmail.com", "Alex", 20)
    println("Person is ${person3.name} and his age is ${person3.age} with an emailId ${person3.email} and nameLength is ${person3.nameLength}")


}