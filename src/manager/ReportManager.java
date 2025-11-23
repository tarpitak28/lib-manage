package manager;

import model.BorrowRecord;
import model.Book;
import model.User;

import java.util.List;

public class ReportManager {
    public void printAllBooks(List<Book> books) {
        System.out.println("--- All Books ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void printAllUsers(List<User> users) {
        System.out.println("--- All Users ---");
        for (User u : users) {
            System.out.println(u);
        }
    }

    public void printBorrowRecords(List<BorrowRecord> records) {
        System.out.println("--- Borrow Records ---");
        for (BorrowRecord r : records) {
            System.out.println(r);
        }
    }
}
