package manager;

import model.Book;
import model.BorrowRecord;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibrarySystem {
    private final BookManager bookManager = new BookManager();
    private final UserManager userManager = new UserManager();
    private final List<BorrowRecord> borrowRecords = new ArrayList<>();

    public BookManager getBookManager() {
        return bookManager;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public List<BorrowRecord> getBorrowRecords() {
        return new ArrayList<>(borrowRecords);
    }

    public boolean borrowBook(String userId, String bookId) {
        Optional<User> userOpt = userManager.findUserById(userId);
        Optional<Book> bookOpt = bookManager.findBookById(bookId);

        if (userOpt.isEmpty() || bookOpt.isEmpty()) return false;
        Book book = bookOpt.get();
        if (!book.isAvailable()) return false;

        book.setAvailable(false);
        BorrowRecord record = new BorrowRecord(book, userOpt.get(), LocalDate.now());
        borrowRecords.add(record);
        return true;
    }

    public boolean returnBook(String userId, String bookId) {
        for (BorrowRecord r : borrowRecords) {
            if (r.getBook().getId().equals(bookId) && r.getUser().getId().equals(userId) && !r.isReturned()) {
                r.setReturnDate(LocalDate.now());
                r.getBook().setAvailable(true);
                return true;
            }
        }
        return false;
    }
}
