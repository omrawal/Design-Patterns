# Book class representing a book
class Book:
    def __init__(self, title):
        self.title = title

    def get_title(self):
        return self.title

# Library class representing a collection of books
class Library:
    def __init__(self):
        self.books = []

    def add_book(self, book):
        self.books.append(book)

    # Iterator class to iterate over the collection of books
    class BookIterator:
        def __init__(self, library):
            self.library = library
            self.current_index = 0

        def __iter__(self):
            return self

        def __next__(self):
            if self.current_index < len(self.library.books):
                book = self.library.books[self.current_index]
                self.current_index += 1
                return book
            else:
                raise StopIteration

    # Method to get an iterator for the collection of books
    def __iter__(self):
        return self.BookIterator(self)

# Main function
def main():
    library = Library()
    library.add_book(Book("Book 1"))
    library.add_book(Book("Book 2"))
    library.add_book(Book("Book 3"))

    # Iterate over the collection of books using the Iterator
    for book in library:
        print("Book Title:", book.get_title())

if __name__ == "__main__":
    main()
