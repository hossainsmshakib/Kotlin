
/*
class hello {
    private val name = "SM"

    fun print() {
        println("Good morning $name")
    }
}
*/

// triangle area
/*
class triangle {
    val height = 10
    val width = 5

    fun printArea() {
        val area = 0.5 * height * width
        println("Area is: $area")
    }
}
*/

// inner class
class Circle {
    private val radius = 10

    inner class AreaCalculation {
        private val circleArea = 3.1416 * Circle().radius

        fun printCircle() {
            println("Area: $circleArea")
        }
    }
}

fun main() {
    //var obj = hello()
    //obj.print()
    //var obj = triangle()
    //obj.printArea()

    val obj = Circle().AreaCalculation()
    obj.printCircle()
}

// data class