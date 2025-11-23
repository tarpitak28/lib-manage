package model;

import java.time.LocalDate;

public class BorrowRecord {
    private Book book;
    private User user;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowRecord(Book book, User user, LocalDate borrowDate) {
        this.book = book;
        this.user = user;
        this.borrowDate = borrowDate;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return returnDate != null;
    }

    @Override
    public String toString() {
        return "BorrowRecord{" +
                "book=" + book +
                ", user=" + user +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
