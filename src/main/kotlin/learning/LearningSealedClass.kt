package learning

// class -> sealed -> enum.
// can access in the same file but not from the other file.
// we can have data class under sealed class.
// we can have another sealed class under a sealed class.
// we can have interface under it.
// we can declare obj also.

open class Shape {
    class Circle(var radius: Double): Shape()
//    class Square(var side: Int): Shape()
//    class Rectangle(var length: Int, var breadth: Int): Shape()

//
//    data class Student(val name: String, val id: String) {
//
//    }
}

fun main() {
    var circle = Shape.Circle(3.5)
    println("Area of the circle is: ${3.1416 * circle.radius * circle.radius}")

//    var square = Shape.Square(6)
//    println("Area of the square is: ${square.side * square.side}")
//
//    var rectangle = Shape.Rectangle(10, 5)
//    println("Area of the rectangle is: ${rectangle.length * rectangle.breadth}")

//    val student1 = Student("S M", "5")
//    val student2 = Student("S M", "5")
//
//    if(student1 == student2) {
//        println("Equal")
//    } else {
//        println("Not equal")
//    }
}