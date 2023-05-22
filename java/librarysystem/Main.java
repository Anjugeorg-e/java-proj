package librarysystem;

public class Main {
    public static void main(String[] args) {

        Member manu = new Member("Manu", 12);
        Book b1 = new Book(101, "B1", "Sam");
        Book b2 = new Book(104, "B2", "Sai");
        // Copy c1b1 = new Copy(1);
        // Copy c2b1 = new Copy(2);
        // Copy c3b1 = new Copy(3);
        Copy c1b1 = new Copy(1, "available", b1);
        Copy c2b1 = new Copy(2, "available", b1);
        Copy c3b1 = new Copy(3, "available", b1);
        Library library = new Library();
        
        Borrowedbook t1 = new Borrowedbook();

        library.addBookToLibrary(b2);
        library.addBookToLibrary(b1);
        library.addMemeberToLibrary(manu);
        System.out.println(library.listOfMembers);
        System.out.println(library.listOfBooks);
        

        // System.out.println("Book found: " + library.searchBook(101));
        // System.out.println("Book found: " + library.searchBook(106));
        // System.out.println("Book found: " + library.searchBook(104));
        // System.out.println("Book found: " + library.searchBook(104));

        // library.searchBook(104);
        // library.searchBook(103);
        // library.searchBook(101);
        // library.searchBook(14);

        // b1.addCopyOfBook(c1b1);
        // b1.addCopyOfBook(c2b1);
        // b1.addCopyOfBook(c3b1);

        // System.out.println("copies: " + b1.listOfCopies);
        // System.out.println(b1.noOfAvailableCopies());

        // // c1b1.setStatus("B2", b2);
        // // System.out.println(c1b1.isStatus());

        // c1b1.borrowCopy(b1, c3b1);
        // c1b1.returnCopy(b1, c3b1);

        // System.out.println("list of b1 copies: " + b1.listOfCopies);
        // manu.borrowBook(c3b1, b1);
        // manu.borrowBook(c1b1, b1);
        // manu.borrowBook(c2b1, b1);

        // System.out.println("borrowed: " + manu.borrowedBooks);



        // manu.returnBook(b1, c3b1);
        // manu.returnBook(b1, c2b1);

        // System.out.println("borrowed books of manu: " + manu.borrowedBooks);
        // System.out.println(c3b1.getStatus());
        // System.out.println(c2b1.getStatus());
        // System.out.println(c1b1.getStatus());

        // System.out.println(manu.noOfBorrowedBooks());

        // System.out.println("Copies: " + b1.listOfCopies);
        // System.out.println(manu.noOfBorrowedBooks());

        // System.out.println("borrowed: " + manu.borrowedBooks);

        // t1.findDuedate(manu, b2, c2b1);

         
        //
        

    }
}
