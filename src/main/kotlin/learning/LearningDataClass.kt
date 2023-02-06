package learning

// class
//class Practice {
//    fun practice() {
//        println("Practicing class.")
//    }
//}
//fun main() {
//    val obj = Practice()
//    println(obj)
//    obj.practice()
//}

// Data class codes - 1
//
//data class Practice(val name: String, val email: String) {
//    fun printName() {
//        println("Hello, this is $name. Send the file to $email")
//    }
//}
//
//fun main() {
//    val obj = Practice("S M", "smsakib2403@gmail.com")
//    obj.printName()
//}

// Data class codes - 2

data class Student(val name: String, val id: String) {

}

fun main() {
    val student1 = Student("S M", "005")
    val student2 = Student("S M", "5")

    if(student1 === student2) {
        println("Equal")
    } else {
        println("Not equal")
    }

    var newStudent = student1.copy(name = "Shakib1")
    println(newStudent)

    println(newStudent.hashCode())
    println(newStudent.component1())
}
// it prints not equal bcz I'm comparing 2 obj only ont the data. but if I use data keyword it will print equal, cz then it will deal with the deta.
