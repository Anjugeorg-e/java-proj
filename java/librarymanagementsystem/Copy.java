package librarymanagementsystem;

public class Copy {
    private int copyNumber;
    private String status;
    private Book book;

    public Copy(int copyNumber, String status, Book book) {
        this.copyNumber = copyNumber;
        this.status = status;
        this.book = book;

    }

    public int getCopyNumber() {
        return copyNumber;
    }

    public void setCopyNumber(int copyNumber) {
    
        this.copyNumber = copyNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(status == "available" || status == "borrowed"){

            this.status = status;
        }
    }

    @Override
    public String toString() {
        return "Copy [copyNumber=" + copyNumber + ", status=" + status + ", " + book + "]";
    }

}
