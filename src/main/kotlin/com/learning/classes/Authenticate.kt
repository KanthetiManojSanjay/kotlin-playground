package com.learning.classes

/**
 * @author kansanja on 13/11/22.
 */

// similar to singleton - create a class and make it available to reuse
object Authenticate {
    fun authenticate(username: String, password: String) {
        println("User authenticated for userName :$username")
    }
}

fun main() {
    Authenticate.authenticate("Sanjay", "123")
}