package learning

import java.awt.Color

// enums are constant values, so they must be initialized in the time of declaration.
//enum class CreditCard {
//    SILVER, GOLD, PLATINUM
//}

// if we want to add more properties except ordinal and names we should use constructor
enum class CreditCard(val cardColor: String) {
    SILVER("Gray"), // constant string values so in ()
    GOLD("Gold"),
    PLATINUM("Black")
}

fun main() {
    val cardType = CreditCard.PLATINUM
    println(cardType)

    // each enum obj has 2 properties. Ordinal(indexing value (0 1 2 .....) and Name.
    println(cardType.ordinal)
    println(cardType.name)

    // each enum obj has 2 methods: values() and valueof()
    // values() prints all the obj in forms of an array
//    val allCardName = CreditCard.values()
//    allCardName.forEach { println(it) }
//    val allCardNam = CreditCard.valueOf("SILVER")
//    println(allCardNam)

//    when(cardType) {
//        CreditCard.SILVER -> println("Has silver card")
//        CreditCard.GOLD -> println("Has gold card")
//        CreditCard.PLATINUM -> {
//            println("Has platinum card")
//        }
//    }

    for (i in CreditCard.values()) {
        println(i)
    }
    
    // printing extra property
    println(CreditCard.PLATINUM.cardColor)
}