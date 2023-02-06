//package bookLibrary
//
//class Book(val bookId: Int, val bookName: String, val authorName: String)
//
//class Borrower(val borrowerId: Int, val borrowerName: String, val borrowerAge: Int)
//
//class BorrowerHistory(val bookId: Int, val borrowerId: Int, val bookName: String,
//                      val borrowerName: String, val borrowerAge: Int, val authorName: String)
//
//fun createBorrowerHistory(book: Book, borrower: Borrower): BorrowerHistory {
//    return BorrowerHistory(book.bookId, borrower.borrowerId, book.bookName, borrower.borrowerName,
//        borrower.borrowerAge, book.authorName)
//}
//
//fun main() {
//    val books = mutableListOf<Book>()
//    for (i in 1..5 ) {
//        books.add(Book(i, "Kotlin book ", "Author $i"))
//    }
//
//    val borrowers = mutableListOf<Borrower>()
//    for (i in 1..5) {
//        borrowers.add(Borrower(i + 50, "Borrower $i", i + 25))
//    }
//
//    val borrowerHistories = mutableListOf<BorrowerHistory>()
//    for (i in books.indices) {
//        borrowerHistories.add(createBorrowerHistory(books[i], borrowers[i]))
//    }
//    println("BookId, BorrowerId, BookName, BorrowerName, BorrowerAge, AuthorName:")
//    for (history in borrowerHistories) {
//        println("BookId: ${history.bookId} BorrowerId: ${history.borrowerId} BookName: ${history.bookName} " +
//                "BorrowerName: ${history.borrowerName} BorrowerAge: ${history.borrowerAge} AuthorName: ${history.authorName}")
//    }
//}
