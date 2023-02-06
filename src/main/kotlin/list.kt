fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    println(list)
    println(list[3])


    val list2 = mutableListOf(1, 3, 5, 7, 9)
    list2[0] = 100
    println(list2)
    println(list2[0])

    list2.add(63)
    println(list2)
    println()

    list2.remove(9)
    println(list2)

    val list3 = mutableListOf<Int>()
    for (i in 1..10) {
        val x = readLine()?.toInt()
        if (x != null) {
            list3.add(x)
        }
    }
    println(list3)
}