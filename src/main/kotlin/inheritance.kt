//overriding
//open class Parent {
//    open fun print() {
//        println("Hi, I am from parent class.")
//    }
//}
//class Child: Parent() {
//    override fun print() {
//        println("Hi, I am from child.")
//    }
//}

//fun main() {
//    Child().sum()
//}

// overloading
 fun sum(num1: Int, num2: Int): Int {
     return num1 + num2
 }

fun sum(num1: Int, num2: Int, num3: Int): Int {
    return num1 + num2 + num3
}

fun sum(num1: Int, num2: Int, num3: Int, num4: Int): Int {
    return num1 + num2+ num3 + num4
}

fun main() {
    var a = sum(1, 5)
    println(a)

    a = sum(1, 2, 5)
    println(a)

    a = sum(1, 2, 3, 4)
    println(a)

    a = sum(1, 2, 100)
    println(a)
}


