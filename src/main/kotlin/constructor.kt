// primary constructor
/*
class Person(val _name: String, val _age: Int) {
    var name: String = _name
    var age: Int

    init {
        this.age = _age
        println("Name: $name")
        println("Age: $age")
    }
}
*/

// secondary constructor
class Person {
    var name: String
    var age: Int

    init {
        println("Initialize block")
    }

    constructor(_name: String, _age: Int) {
        this.name = _name
        this.age = _age
        println("Name: $name")
        println("Age: $age")
    }



}
fun main() {
     Person("S M", 23)
}
