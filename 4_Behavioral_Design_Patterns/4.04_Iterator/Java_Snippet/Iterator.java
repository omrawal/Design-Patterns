import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Book class representing a book
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

// Library class representing a collection of books
class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    // Iterator class to iterate over the collection of books
    private class BookIterator implements Iterator<Book> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < books.size();
        }

        @Override
        public Book next() {
            return books.get(currentIndex++);
        }
    }

    // Method to get an iterator for the collection of books
    public Iterator<Book> iterator() {
        return new BookIterator();
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Book 1"));
        library.addBook(new Book("Book 2"));
        library.addBook(new Book("Book 3"));

        // Iterate over the collection of books using the Iterator
        Iterator<Book> iterator = library.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book Title: " + book.getTitle());
        }
    }
}
