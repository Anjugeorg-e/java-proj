package librarymanagementsystem;

public class Main {

    public static void main(String[] args) {

        Member manu = new Member("Manu", 12);
        Book b1 = new Book(101, "War and peace", "Leo Tolstoy", "km");
        Book b2 = new Book(104, "An introduction to dreamland", "Bhagat Singh", "SK");

        Copy c1b1 = new Copy(1, "available", b1);
        Copy c2b1 = new Copy(2, "available", b1);
        Copy c3b1 = new Copy(3, "available", b1);
        Copy c1b2 = new Copy(1, "available", b2);
        Copy c2b2 = new Copy(2, "available", b2);

       
        Library library = new Library();
        Transaction t1 = new Transaction();

        library.addBookToLibrary(b2);
        library.addBookToLibrary(b1);
        library.addMemeberToLibrary(manu);
        System.out.println(library.listOfMembers);
        System.out.println(library.listOfBooks);

        System.out.println("Book found: " + library.searchBook(101));
        System.out.println("Book found: " + library.searchBook(106));
        System.out.println("Book found: " + library.searchBook(104));

        b1.addCopyOfBook(c1b1);
        b1.addCopyOfBook(c2b1);
        b1.addCopyOfBook(c3b1);
        b2.addCopyOfBook(c1b2);
        b2.addCopyOfBook(c2b2);

        System.out.println("copies of b1 : " + b1.listOfCopies);
        System.out.println("Available copies count of b1: " + b1.noOfAvailableCopies());
        System.out.println("copies of b2: " + b2.listOfCopies);
        System.out.println("available copies count of b2: " + b2.noOfAvailableCopies());

        t1.BorrowCopy(manu, b1, c1b1);
        // t1.BorrowCopy(manu, b2, c2b2);
        System.out.println(c2b1.getStatus());
        t1.BorrowCopy(manu, b1, c2b1);
        t1.BorrowCopy(manu, b1, c1b2);

       
        System.out.println("copies of b1 : " + b1.listOfCopies);
        System.out.println("Available copies count of b1: " + b1.noOfAvailableCopies());
        System.out.println("copies of b2: " + b2.listOfCopies);
        System.out.println("available copies count of b2: " + b2.noOfAvailableCopies());
        System.out.println("Books in members hand: " + t1.booksInMembersHand);
        System.out.println(manu.noOfBorrowedBooks());

        // c1b1.setCopyNumber(6);
        // System.out.println(c2b2.getCopyNumber());
        // System.out.println(b1.listOfCopies);
        // System.out.println(c1b1.getCopyNumber());

        
        

    }
}
