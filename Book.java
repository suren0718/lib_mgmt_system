import java.util.HashMap;
public class Book {
    public String bookName;
    public String bookAuthor;
    public int bookYear;
    public String bookGenre;
    public String lastBorrower;

    private static HashMap<String, String> bookStatuses = new HashMap<>();

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getLastBorrower() {
        return lastBorrower;
    }

    public void setLastBorrower(String lastBorrower) {
        this.lastBorrower = lastBorrower;
    }


    //methods
    public void history() {
        if (lastBorrower == null) {
            System.out.println("No one has borrowed the book " + bookName + " yet.");
        } else {
            System.out.println("The book " + bookName + " was last borrowed by: " + lastBorrower);
        }
    }
    public void viewStatus(){
        String status = bookStatuses.getOrDefault(bookName, "Available");
        System.out.println("The status of the book " + bookName + " is: " + status);
    }
    public static void updateStatus(String bookName, String status) {
        bookStatuses.put(bookName, status);
        System.out.println("Status of the book " + bookName + " updated to: " + status);
    }


}
