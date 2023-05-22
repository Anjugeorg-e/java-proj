package librarymanagementsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CopyTest {
    @Test
    public void testSetCopyNumber() {
        Book book1 = new Book(101, "War and peace", "Leo Tolstoy", "km");
        Copy c1b1 = new Copy(1, "available", book1);
        Copy c2b1 = new Copy(2, "available", book1);

        c1b1.setCopyNumber(1);
        assertEquals(1, c1b1.getCopyNumber());

        c2b1.setCopyNumber(2);
        assertEquals(2, c2b1.getCopyNumber());


    }

    @Test
    public void testSetCopyStatus() {
        Book book1 = new Book(101, "War and peace", "Leo Tolstoy", "km");
        Copy c1b1 = new Copy(1, "available", book1);
        Copy c2b1 = new Copy(2, "available", book1);

        c1b1.setStatus("availble");
        assertSame("available", c1b1.getStatus());

        c2b1.setStatus("borrowed");
        assertSame("borrowed", c2b1.getStatus());


    }
}