package com.learning.interfaces

import com.learning.classes.Course

/**
 * @author kansanja on 13/11/22.
 */

// Interface1
interface CourseRepository {
    val isCoursePersisted: Boolean
    fun getById(id: Int): Course

    fun saveCourse(course: Course): Int {
        println("Course is $course")
        return course.id
    }

}

// Interface2
interface Repository {
    fun getAll(): Any
}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}


// implementing 2 interfaces
class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false


    // overiding abstract methods
    override fun getById(id: Int): Course {
        return Course(id, "Reactive Programming", "Sanjay")
    }

    override fun getAll(): Any {
        return 1
    }

    override fun saveCourse(course: Course): Int {
        isCoursePersisted = true
        return super.saveCourse(course)
    }
}

class AB : A, B {
    override fun doSomething() {

        // A & B Interface having same methodName then ue below generics to call appropriate interface methods
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }


}

class NoSqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false


    override fun getById(id: Int): Course {
        return Course(id, "projector reactor", "Sanjay")
    }

    // overiding nonAbstract methods
    override fun saveCourse(course: Course): Int {
        isCoursePersisted = true
        println("Course saved in NoSQLRepository is $course")
        return course.id
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println(course)

    val courseId = sqlCourseRepository.saveCourse(Course(5, "WebFlux", "Sanjay"))
    println("New course registeredId is $courseId")

    println("Course persisted value is ${sqlCourseRepository.isCoursePersisted} ")


    val noSqlCourseRepository = NoSqlCourseRepository()
    val course2 = noSqlCourseRepository.getById(2)
    println(course2)

    val courseId2 = noSqlCourseRepository.saveCourse(Course(6, "Java17", "Sanjay"))
    println("New course registeredId in NoSQLRepository is $courseId2")
    println("Course persisted value is ${noSqlCourseRepository.isCoursePersisted} ")

    val ab = AB()
    ab.doSomething()

}