package librarymanagementsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MemberTest {
  

    @Test
    public void testSetID() {
        Member anu = new Member("Anu", 4);
        anu.setID(4);
        assertEquals(4, anu.getID());

        anu.setID(-1);
        assertEquals(4, anu.getID());
    }

    @Test
    public void testNoOfBorrowedBooks() {

        Member manu = new Member("Manu", 12);
        Book book1 = new Book(101, "War and peace", "Leo Tolstoy", "km");
        Copy c1b1 = new Copy(1, "borrowed", book1);
        Copy c2b1 = new Copy(2, "available", book1);
        book1.addCopyOfBook(c2b1);
        Transaction t1 = new Transaction();
        t1.BorrowCopy(manu, book1, c2b1);
        t1.BorrowCopy(manu, book1, c1b1);
        
        assertEquals(1, manu.noOfBorrowedBooks());
        


    }

 
}
