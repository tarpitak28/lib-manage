package manager;

import model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookManager {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBookById(String id) {
        return books.removeIf(b -> b.getId().equals(id));
    }

    public Optional<Book> findBookById(String id) {
        return books.stream().filter(b -> b.getId().equals(id)).findFirst();
    }

    public List<Book> listBooks() {
        return new ArrayList<>(books);
    }
}
