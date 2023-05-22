package librarysystem;

public class Copy {
    private int copyNumber;
    private String status;
    

    public Copy(int copyNumber, String status, Book book) {
        this.copyNumber = copyNumber;
        this.status = status;

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
        this.status = status;
    }

    @Override
    public String toString() {
        return "Copy [copyNumber=" + copyNumber + ", status=" + status + "]";
    }
  

 
}