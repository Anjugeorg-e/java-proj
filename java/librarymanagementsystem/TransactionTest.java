package librarymanagementsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TransactionTest {
    @Test
    public void testBorrowCopy() {

        Book book1 = new Book(101, "War and peace", "Leo Tolstoy", "km");
        Copy c1b1 = new Copy(1, "available", book1);
        Copy c2b1 = new Copy(2, "available", book1);
        book1.addCopyOfBook(c1b1);

    }

    @Test
    public void testReturnCopy() {

        Member manu = new Member("Manu", 12);
        Book book1 = new Book(101, "War and peace", "Leo Tolstoy", "km");
        Copy c1b1 = new Copy(1, "available", book1);
        Copy c2b1 = new Copy(2, "borrowed", book1);
        Library library = new Library();
        Transaction t1 = new Transaction();
        

        assertEquals(true, t1.returnCopy(manu, c2b1, book1));
        assertEquals(false, t1.returnCopy(manu, c1b1, book1));
    }
}

