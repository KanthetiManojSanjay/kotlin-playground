package com.learning.classes

/**
 * @author kansanja on 13/11/22.
 */
class Item() {
    var name: String = ""
    var price: Double = 0.0
        //        get() = field
        get() {
            println("Inside Getter")
            return field
        }
        set(value) {
            if (value >= 0.0) {
                println("Inside Setter")
                field = value
            } else {
                throw IllegalArgumentException("Negative price is not allowed!")
            }

        }


    // Secondary constructor
    constructor(_name: String) : this() {
        name = _name;
    }
}

fun main() {
    val item = Item("IPhone")
    println("ItemName is : ${item.name}")
    val item2 = Item("IPhone13")
    println("ItemName is : ${item2.name}")

    item.price = 10.0
    println(item.price)

}