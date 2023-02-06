fun main() {
    val a = A()
    val summation = a.sumofnumber(1,2)
    val obj = A().sumofnumber(1, 2)
    println(obj)
}

class A {
    fun sumofnumber(a: Int, b: Int): Int {
        return a+b
    }
}