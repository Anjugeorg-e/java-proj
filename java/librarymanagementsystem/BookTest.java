package librarymanagementsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BookTest {

    @Test
    public void testSetISBNnumber() {
        Book book1 = new Book(101, "War and peace", "Leo Tolstoy", "km");
        book1.setISBNnumber(120);
        assertEquals(120, book1.getISBNnumber());

        book1.setISBNnumber(10);
        assertEquals(120, book1.getISBNnumber());
    }

    @Test
    public void testAddCopyOfBook() {

        Book book1 = new Book(101, "War and peace", "Leo Tolstoy", "km");
        Copy c1b1 = new Copy(1, "available", book1);
        Copy c2b1 = new Copy(2, "available", book1);

        assertEquals(true, book1.addCopyOfBook(c1b1));
        assertEquals(true, book1.addCopyOfBook(c2b1));

    }

    @Test
    public void testNoOfAvailableCopies() {
        Book book1 = new Book(101, "War and peace", "Leo Tolstoy", "km");
        Copy c1b1 = new Copy(1, "available", book1);
        Copy c2b1 = new Copy(2, "available", book1);

        Book book2 = new Book(104, "An introduction to dreamland", "Bhagat Singh", "SK");

        book1.addCopyOfBook(c2b1);
        book1.addCopyOfBook(c1b1);

        assertEquals(2, book1.noOfAvailableCopies());
        assertEquals(0, book2.noOfAvailableCopies());

    }

}
