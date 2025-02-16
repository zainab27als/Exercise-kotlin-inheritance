package library


fun main() {
    val fictionBook = FictionBook("The Magic Realm", "Jane Smith", "987-654321", "Fantasy")
    val nonFictionBook = NonFictionBook("A Brief History of Time", "Stephen Hawking", "123-987654", "Science")

    println("Fiction Book Info:")
    fictionBook.displayInfo()

    println("\nNon-Fiction Book Info:")
    nonFictionBook.displayInfo()
}