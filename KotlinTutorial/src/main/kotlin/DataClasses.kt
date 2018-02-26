/**
 * Created by waqas on 2/25/2018.
 */
fun main(args: Array<String>) {
    val book: Book = Book("Kotlin","Kotlin World",5)
    println("Name of the Book is --" + book.name)
    println("Publisher Name--" + book.publisher)
    println("Review of the book is ---" + book.reviewScore)

    book.reviewScore = 7
    println("Printing all the info all together--" + book.toString())
    //using inbuilt function of the data class

    println("Example of the HasCode function--" + book.hashCode())
}

data class Book(val name: String, val publisher: String, var reviewScore: Int)