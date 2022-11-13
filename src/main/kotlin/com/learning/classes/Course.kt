package com.learning.classes

/**
 * @author kansanja on 13/11/22.
 */

// Bydefault data classes overrides toString, equals & hashCode
data class Course(
    val id: Int,
    val name: String,
    val author: String,
    val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

// Enum
enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val course = Course(1, "Reactive Programming", "Sanjay")
    println(course)
    println("courseId is ${course.id} and the courserName is ${course.name} and the author is ${course.author}")

    val course2 = Course(1, "Reactive Programming", "Sanjay")
    println("${course == course2}")

    val course3 = course.copy(
        id = 2,
        name = "Java11",
        author = "Sanjay"
    )

    println(course3)

    val course4 = Course(4, "Faebook Marketing", "Sanjay", CourseCategory.MARKETING)
    println(course4)

}