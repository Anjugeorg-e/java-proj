package librarymanagementsystem;

import java.util.ArrayList;

public class Member {
    private String name;
    private int ID;
    ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Member(String name, int ID) {
        this.name = name;
        ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        if (iD > 0) {

            ID = iD;
        }
    }

    public int noOfBorrowedBooks() {
        return this.borrowedBooks.size();

    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", ID=" + ID + "]";
    }
}
