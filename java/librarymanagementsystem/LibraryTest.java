package librarymanagementsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibraryTest {
    
    @Test
    public void testSearchBook() {
        Book book1 = new Book(101, "War and peace", "Leo Tolstoy", "km");
        Library library = new Library();

        library.addBookToLibrary(book1);
        assertEquals(true,library.searchBook(101));
        
        assertEquals(false, library.searchBook(120));


    }
}
