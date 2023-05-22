package librarysystem;

import java.util.ArrayList;

public class Member {
    private String name;
    private int ID;
    ArrayList<Book> borrowedBooks = new ArrayList<>();
    Library library;

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
        ID = iD;
    }

    public void borrowBook(Copy copy, Book book) {
        if (copy.getStatus() == "available") {
            this.borrowedBooks.add(book);
            copy.setStatus("borrowed");
        }
    }

    public void returnBook(Book book, Copy copy) {
        this.borrowedBooks.remove(book);
        copy.setStatus("available");
    }

    public int noOfBorrowedBooks() {
        return this.borrowedBooks.size();

    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", ID=" + ID + "]";
    }

}
