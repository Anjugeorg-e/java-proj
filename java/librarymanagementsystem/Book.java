package librarymanagementsystem;

import java.util.ArrayList;

public class Book {
    private int ISBNnumber;
    private String title;
    private String author;
    private String publisher;
    private String date;

    ArrayList<Copy> listOfCopies = new ArrayList<>();

    public Book(int iSBNnumber, String title, String author, String publisher) {
        ISBNnumber = iSBNnumber;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public int getISBNnumber() {
        return ISBNnumber;
    }

    public void setISBNnumber(int iSBNnumber) {
        if(iSBNnumber>100){

            ISBNnumber = iSBNnumber;
        }

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public boolean addCopyOfBook(Copy copy) {
        this.listOfCopies.add(copy);
        return true;
    }


    public void removeCopyOfBook(Copy copy) {
        if(listOfCopies.contains(copy)){
            this.listOfCopies.remove(copy);
        }
        
    }

    public int noOfAvailableCopies() {
        return this.listOfCopies.size();
    }

    @Override
    public String toString() {
        return "Book [ISBNnumber=" + ISBNnumber + ", title=" + title + "]";
    }
}

