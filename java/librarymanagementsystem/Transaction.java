package librarymanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Transaction {

    ArrayList<Copy> booksInMembersHand = new ArrayList<>();
    LocalDate date = LocalDate.of(2023, 5, 4);
    LocalDate due = date.plusDays(30);

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDue() {
        return due;
    }

    public void setDue(LocalDate due) {
        this.due = due;
    }

    public void BorrowCopy(Member member, Book book, Copy copy) {
        if (book.listOfCopies.contains(copy) && copy.getStatus() == "available") {
            book.listOfCopies.remove(copy);
            booksInMembersHand.add(copy);
            member.borrowedBooks.add(book);
            copy.setStatus("borrowed");
            setDate(date);

        } else {
            System.out.println("Copy is not available. Cant borrow book");
        }
    }

    public boolean returnCopy(Member member, Copy copy, Book book) {
       boolean returned = false;
        if (copy.getStatus() == "borrowed") {
            book.listOfCopies.add(copy);
            booksInMembersHand.remove(copy);
            member.borrowedBooks.remove(book);
            copy.setStatus("available");

            returned = true;
        }else{
            returned = false;
        }
        return returned;
    }
}
