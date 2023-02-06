package bookLibrary

class Books(var bookId: Int, var bookName: String, var authorName: String)

class Borrower(var borrowerId: Int, var borrowerName: String, var borrowerAge: Int)

class BorrowerHistory(var bookId: Int, var borrowerId: Int)

// accept book and borrower class
fun getBorrowerHistory(books: Books, borrower: Borrower): BorrowerHistory {
    return BorrowerHistory(books.bookId, borrower.borrowerId)
}

fun main() {
    // creating dummy for book list
    val booksList = mutableListOf<Books>()
    for (i in 1..5) {
        booksList.add(Books(i, "Kotlin Book Name $i", "Author Name $i"))
    }

    // creating dummy for borrower
    val borrowerList = mutableListOf<Borrower>()
    for (i in 1..5) {
        borrowerList.add(Borrower(i + 100, "Borrower Name $i", i + 30))
    }

    val borrowerHistoryList = mutableListOf<BorrowerHistory>()
    for (i in booksList.indices) {
        val borrowerHistory = getBorrowerHistory(booksList[i], borrowerList[i])
        borrowerHistoryList.add(borrowerHistory)
    }

    println("Borrower History:")
    for (borrowerHistory in borrowerHistoryList) {
        println("Book ID: ${borrowerHistory.bookId}, Borrower ID: ${borrowerHistory.borrowerId}")
    }
}