package librarymanagement;

public class Book {

    // variables
    private String bookName;
    private int bookID;
    private boolean isAvailable;
    private String issueDate;

    // constructor

    public Book(String bookName, int bookID) {
        this.bookName = bookName;
        this.bookID = bookID;
    }

    // getter and setter

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        if (bookID > 0) {

            this.bookID = bookID;
        }
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Book [bookName=" + bookName + ", bookID=" + bookID + "]";
    }

}
