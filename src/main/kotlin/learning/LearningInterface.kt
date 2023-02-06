package learning

interface Shape1 {
    fun area(): Double
}

class Circle(val radius: Double) : Shape1 {
    override fun area(): Double {
        return 3.1416 * radius * radius
    }
}

class Rectangle(val width: Double, val height: Double) : Shape1 {
    override fun area(): Double {
        return width * height
    }
}

fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(5.0, 10.0)
    println("Circle area: ${circle.area()}")
    println("Rectangle area: ${rectangle.area()}")
}
