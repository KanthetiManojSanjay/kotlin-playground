package com.learning.classes

/**
 * @author kansanja on 13/11/22.
 */

// Add open keyword to make class available to inherit
open class User(val name: String) {
    open var isLoggedIn: Boolean = false

    open fun login() {
        println("Inside user Login")

    }

    // Access modifiers are public, private, protected, internal. Default is public
    private fun secret() {
        println("inside private method")
    }

    protected open fun logout() {
        println("inside protected method")
    }

}

// we cant extends more than 1 class
class Student(name: String) : User(name) {

    override var isLoggedIn: Boolean = false

    // behaves like a static using companion object inside class
    companion object {
        const val noOfEnrolledCourses = 10
        fun country() = "USA"

    }

    // can override parent class method which is open
    override fun login() {
        println("Inside student Login")
        super.login()
    }

    public override fun logout() {
        super.logout()
        println("Inside userlogout")
    }

}

class Instructor(name: String) : User(name) {
    override fun login() {
        println("Inside instructor Login")

    }
}

fun main() {
    val student = Student("Alex")
    println("StudentName is ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Loggedin Value is ${student.isLoggedIn}")

    val country = Student.country()
    println("No. of enrolled students are ${Student.noOfEnrolledCourses} for  Country is : $country")

    val instructor = Instructor("Bob")
    println("InstructorName is ${instructor.name}")
    instructor.login()

    val user = User("Alex")

    student.logout()

}