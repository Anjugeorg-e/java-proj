package librarysystem;

import java.util.ArrayList;

public class Library {

    private String libraryName;
    ArrayList<Book> listOfBooks = new ArrayList<>();
    ArrayList<Member> listOfMembers = new ArrayList<>();

    // getters

    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public ArrayList<Member> getListOfMembers() {
        return listOfMembers;
    }

    // methods

    public void addBookToLibrary(Book book) {
        this.listOfBooks.add(book);
    }

    public void removeBookFromLibrary(Book book) {
        this.listOfBooks.remove(book);
    }

    public void addMemeberToLibrary(Member member) {
        this.listOfMembers.add(member);
    }

    public void removeMemberFromLibrary(Member member) {
        this.listOfMembers.remove(member);
    }

    public boolean searchBook(int ISBNnumber) {
        for (Book book : listOfBooks) {
            if (book.getISBNnumber() == ISBNnumber) {
                return true;
            }
        }
        return false;
    }
}
