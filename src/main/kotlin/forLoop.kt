fun main() {
    val numbers = arrayOf(1, 2, 3, 4)
    for (i in numbers) {
        print("$i ")
    }
    println()
    for(i in 1..20) {
        if (i%3 == 0) {
            print("$i ")
        }
    }

    //even odd
    println()
    for(i in 1..10) {
        if (i%2 == 0) {
            print("Even: $i ")
        }
        else {
            print("odd: $i ")
        }
    }
    println()
    // print in descending order
    for (i in 10 downTo 1) {
        print("$i ")
    }

    println()
    // step
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()
    // until
    for (i in 1 until 10)
        print("$i ")
}