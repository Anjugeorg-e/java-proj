package librarymanagement;

import java.util.ArrayList;

public class Category {

    private String Type;
    ArrayList<Book> booksInCategory = new ArrayList<>();
    ArrayList<Book> sameBooksInCategory = new ArrayList<>();

    public void addBookToCategory(Book book) {
        booksInCategory.add(book);
    }

    public void removeBookFromCategory(Book book) {
        booksInCategory.remove(book);
    }

    public boolean searchBookFromCategory(Book book) {
        boolean found = false;
        if (booksInCategory.contains(book)) {
            found = true;
        } else {
            found = false;
        }
        return found;
    }

    public void sameBookFromCategory(Book book) {
        for (Book books : booksInCategory) {
            if (books.getBookName() == book.getBookName()) {
                sameBooksInCategory.add(book);
            }
        }
        System.out.println(sameBooksInCategory);
    }

    public int noOfBooksInCategory() {

        return booksInCategory.size();
    }

    public int noOfSameBooks() {
        return sameBooksInCategory.size();
    }

}
