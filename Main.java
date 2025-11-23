import manager.LibrarySystem;
import manager.ReportManager;
import model.Book;
import model.User;

public class Main {
    public static void main(String[] args) {
        LibrarySystem system = new LibrarySystem();
        ReportManager report = new ReportManager();

        // Add sample books
        system.getBookManager().addBook(new Book("b1", "1984", "George Orwell"));
        system.getBookManager().addBook(new Book("b2", "Brave New World", "Aldous Huxley"));

        // Add sample users
        system.getUserManager().addUser(new User("u1", "Alice"));
        system.getUserManager().addUser(new User("u2", "Bob"));

        // Show initial state
        report.printAllBooks(system.getBookManager().listBooks());
        report.printAllUsers(system.getUserManager().listUsers());

        // Borrow a book
        boolean borrowed = system.borrowBook("u1", "b1");
        System.out.println("Borrowed b1 by u1: " + borrowed);

        // Try to borrow the same book by someone else
        boolean borrowed2 = system.borrowBook("u2", "b1");
        System.out.println("Borrowed b1 by u2: " + borrowed2);

        // Show borrow records
        report.printBorrowRecords(system.getBorrowRecords());

        // Return the book
        boolean returned = system.returnBook("u1", "b1");
        System.out.println("Returned b1 by u1: " + returned);

        report.printBorrowRecords(system.getBorrowRecords());
    }
}
