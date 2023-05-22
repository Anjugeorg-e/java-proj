package librarysystem;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Borrowedbook {

    // String pattern = "yyyy-MM-dd";
    // SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    // String date = simpleDateFormat.format(new Date());
    // String task_due_date = 
    // LocalDateTime date = LocalDateTime.now();
    // LocalDateTime tomorow = date.plusDays(10);


    LocalDate  date = LocalDate.of(2023, 12,7);
    LocalDate due = date.plusDays(10);


    private String dueDate;

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    ArrayList<Book> booksInMembersHand = new ArrayList<>();

    public void findDuedate(Member manu, Book book, Copy copy) {
        System.out.println(date);
        System.out.println(due);
        manu.borrowBook(copy, book);


    }

}
