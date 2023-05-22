package librarymanagement;

import java.util.ArrayList;

public class Member {

    // variables
    private String name;
    private int MemberID;
    private int age;
    ArrayList<Book> booksInHand = new ArrayList<>();

    // constructor

    public Member(String name, int memberID) {
        this.name = name;
        MemberID = memberID;
    }

    // setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberID() {
        return MemberID;
    }

    public void setMemberID(int memberID) {
        if (memberID > 0) {
            MemberID = memberID;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // methods

    public boolean borrowBook(Book book) {
        boolean found = false;
        if (book.isAvailable() == true) {
            booksInHand.add(book);
            found = true;
        } else {
            found = false;
        }
        return found;

    }

    public boolean returnBook(Book book) {
        booksInHand.remove(book);
        return true;
    }

    public int noOfBooksInHand() {
        return booksInHand.size();
    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", MemberID=" + MemberID + ", age=" + age + "]";
    }

}
