import java.util.Scanner;
import java.util.HashMap;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Storing multiple students and books
        HashMap<String, Student> students = new HashMap<>();
        HashMap<String, Book> books = new HashMap<>();

        // Librarian object
        Librarian lib = new Librarian();
        lib.setLibName("Mr. John");
        lib.setLibId(101);
        lib.setLibDept("Library Management");


        while (true) {
            System.out.println("\n--- Library System Menu ---");
            System.out.println("1. Add a student");
            System.out.println("2. Add a book");
            System.out.println("3. Show all books");
            System.out.println("4. Student borrows a book");
            System.out.println("5. Student returns a book");
            System.out.println("6. View book status");
            System.out.println("7. Librarian updates a book");
            System.out.println("8. Librarian removes a book");
            System.out.println("9.View book borrow history");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add a student
                    System.out.print("Enter student name: ");
                    String studName = scanner.nextLine();
                    System.out.print("Enter student department: ");
                    String studDept = scanner.nextLine();
                    System.out.print("Enter student year: ");
                    int studYear = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student class: ");
                    String studClass = scanner.nextLine();

                    Student student = new Student();
                    student.setStudName(studName);
                    student.setStudDept(studDept);
                    student.setStudYear(studYear);
                    student.setStudClass(studClass);

                    students.put(studName, student);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    // Add a book
                    System.out.print("Enter book name: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String bookAuthor = scanner.nextLine();
                    System.out.print("Enter book genre: ");
                    String bookGenre = scanner.nextLine();

                    Book book = new Book();
                    book.setBookName(bookName);
                    book.setBookAuthor(bookAuthor);
                    book.setBookGenre(bookGenre);

                    books.put(bookName, book);
                    System.out.println("Book added successfully.");
                    break;

                case 3:
                    // Show all books
                    if (books.isEmpty()) {
                        System.out.println("No books have been added yet.");
                    } else {
                        System.out.println("\n--- List of Books ---");
                        for (Book b : books.values()) {
                            System.out.println("Book Name: " + b.getBookName());
                            System.out.println("Author: " + b.getBookAuthor());
                            System.out.println("Genre: " + b.getBookGenre());
                            System.out.println("----------------------");
                        }
                    }
                    break;

                case 4:
                    // Student borrows a book
                    System.out.print("Enter student name: ");
                    String borrowerName = scanner.nextLine();
                    System.out.print("Enter book name: ");
                    String borrowedBookName = scanner.nextLine();

                    Student borrower = students.get(borrowerName);
                    Book borrowedBook = books.get(borrowedBookName);

                    if (borrower != null && borrowedBook != null) {
                        borrower.getBook(borrowedBookName);
                        borrowedBook.setLastBorrower(borrowerName);
                        Book.updateStatus(borrowedBookName, "Borrowed");
                    } else {
                        System.out.println("Student or book not found.");
                    }
                    break;

                case 5:
                    // Student returns a book
                    System.out.print("Enter student name: ");
                    String returnerName = scanner.nextLine();
                    System.out.print("Enter book name: ");
                    String returnedBookName = scanner.nextLine();

                    Student returner = students.get(returnerName);
                    Book returnedBook = books.get(returnedBookName);

                    if (returner != null && returnedBook != null) {
                        returner.returnBook(returnedBookName);
                        Book.updateStatus(returnedBookName, "Available");
                    } else {
                        System.out.println("Student or book not found.");
                    }
                    break;

                case 6:
                    // View book status
                    System.out.print("Enter book name: ");
                    String statusBookName = scanner.nextLine();
                    Book statusBook = books.get(statusBookName);

                    if (statusBook != null) {
                        statusBook.viewStatus();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 7:
                    // Librarian updates a book
                    System.out.print("Enter book name to update: ");
                    String updateBookName = scanner.nextLine();
                    System.out.print("Enter new details: ");
                    String newDetails = scanner.nextLine();

                    if (books.containsKey(updateBookName)) {
                        lib.updateBook(updateBookName, newDetails);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 8:
                    // Librarian removes a book
                    System.out.print("Enter book name to remove: ");
                    String removeBookName = scanner.nextLine();

                    if (books.containsKey(removeBookName)) {
                        lib.removeBook(removeBookName);
                        books.remove(removeBookName);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 9:
                    // View book borrowing history
                    System.out.print("Enter book name to view history: ");
                    String historyBookName = scanner.nextLine();
                    Book historyBook = books.get(historyBookName);

                    if (historyBook != null) {
                        historyBook.history();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 10:
                    // Exit the system
                    System.out.println("Exiting the library system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
