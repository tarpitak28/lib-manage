# README.md
// filepath: c:\Users\ktarp\OneDrive\Documents\library-management-system\library-management-system\README.md

# Library Management System

This is a simple Java-based Library Management System. It allows you to manage books, users, and borrowing records in a library.

## Features

- Add and list books
- Add and list users
- Borrow and return books
- View borrow records
- Simple reporting via console output

## Project Structure

```
Main.java
src/
  manager/
    BookManager.java
    LibrarySystem.java
    ReportManager.java
    UserManager.java
  model/
    Book.java
    BorrowRecord.java
    User.java
```

- **model/**: Contains data classes for `Book`, `User`, and `BorrowRecord`.
- **manager/**: Contains classes for managing books, users, borrow records, and reporting.
- **Main.java**: Entry point with sample usage.

## How to Run

1. Compile all `.java` files:
   ```sh
   javac Main.java src/model/*.java src/manager/*.java
   ```
2. Run the program:
   ```sh
   java Main
   ```

## Sample Output

The program demonstrates:
- Adding books and users
- Borrowing and returning books
- Printing lists and borrow records

## Extending

You can extend the system by:
- Adding persistence (e.g., saving to files or a database)
- Adding more features (e.g., search, overdue tracking)
- Improving the user interface

