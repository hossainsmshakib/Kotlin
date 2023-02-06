fun main() {
    val name = listOf("Apple", "Banana", "Orange", "Berry", "Lemon")
    val filtered = name.filter { it != "Apple" }
    println(filtered)

    val filtered2 = name.filter { it == "Apple" }
    println(filtered2)

    val filtered3 = name.filter { it.toLowerCase().contains("a") }
    println(filtered3)
}