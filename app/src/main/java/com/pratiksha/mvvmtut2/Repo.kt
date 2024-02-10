package com.pratiksha.mvvmtut2

object Repo {

    fun getAllBooks() = listOf<Book>(
        Book(bookName = "104 missing days",
        bookAuthor = "chetan bhagat",
        bookPrice = "100"),
        Book(bookName = "105 missing days",
            bookAuthor = "chetan bhagat",
            bookPrice = "102"),
        Book(bookName = "104 missing days",
            bookAuthor = "chetan bhagat",
            bookPrice = "103"),
        Book(bookName = "105 missing days",
            bookAuthor = "chetan bhagat",
            bookPrice = "105")
    )


}