/*
abstract class Car() {
    abstract fun run()
}

class Maserati: Car() {
    override fun run() {
        println("My Maserati is running at 50mph.")
    }
}
*/

// A non-abstract open member function can be overridden in an abstract class.
open class Car {
    open fun run() {
        println("My Maserati is running at 50mph.")
    }
}

abstract  class Maserati: Car() {
    abstract override fun run()
}

class City: Maserati() {
    override fun run() {
        println("Maserati is running on Dhaka city.")
    }
}


fun main() {
    val maserati = Car()
    maserati.run()
    val city = City()
    city.run()
}