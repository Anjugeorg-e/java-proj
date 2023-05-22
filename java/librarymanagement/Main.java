package librarymanagement;

public class Main {

    public static void testMemeberID() {

        Member manu = new Member("Manu", 12);

        int given;
        int expected;
        int got;

        // test case1
        given = 2;
        expected = 2;
        manu.setMemberID(given);
        got = manu.getMemberID();
        assert (got == expected) : "setID : Test 1 failed,  given :" + given + " exp: " + expected + "but got: " + got;

        // test case2
        given = -1;
        manu.setMemberID(given);
        got = manu.getMemberID();
        assert (got == expected) : "setID : Test 2 failed,  given :" + given + " exp: " + expected + "but got: " + got;

    }

    public static void testBookID() {

        Book b1 = new Book("B1", 1);
        int given;
        int expected;
        int got;

        // test case1
        given = 2;
        expected = 2;
        b1.setBookID(given);
        got = b1.getBookID();
        assert (got == expected)
                : "setBookID : Test 1 failed,  given :" + given + " exp: " + expected + "but got: " + got;

        // test case2
        given = -1;
        b1.setBookID(given);
        got = b1.getBookID();
        assert (got == expected)
                : "setBookID : Test 2 failed,  given :" + given + " exp: " + expected + "but got: " + got;

    }

    public static void testSearchBookFromCategory() {

        Book b1 = new Book("B1", 1);
        Book b2 = new Book("B2", 2);
        Category classic = new Category();
        classic.addBookToCategory(b1);
        boolean given;
        boolean expected;
        boolean got;

        // test case1
        given = true;
        expected = true;
        got = classic.searchBookFromCategory(b1);
        assert (got == expected)
                : "searchbookfromcategory : Test 1 failed, " + "  exp: " + expected + "but got: " + got;

        // test case2
        given = true;
        expected = false;
        got = classic.searchBookFromCategory(b2);
        assert (got == expected)
                : "searchbookfromcategory : Test 2 failed,  " + " exp: " + expected + "but got: " + got;

    }

    public static void testNoOfBooksInCategory() {

        Book b1 = new Book("B1", 1);
        Book b2 = new Book("B2", 2);
        Category classic = new Category();
        classic.addBookToCategory(b1);
        classic.addBookToCategory(b2);

        int given;
        int expected;
        int got;

        // test case1
        given = 2;
        expected = 2;
        got = classic.noOfBooksInCategory();
        assert (got == expected)
                : "searchNoOfBooksInCategory : Test 1 failed," + " exp: " + expected + "but got: " + got;

    }

    public static void testNoOfSameBooks() {

        Book b1 = new Book("B1", 1);
        Book b2 = new Book("B2", 2);
        Category classic = new Category();
        classic.addBookToCategory(b1);
        classic.addBookToCategory(b2);
        int given;
        int expected;
        int got;

        // test case1
        given = 2;
        expected = 0;
        got = classic.noOfSameBooks();
        assert (got == expected) : "searchNoOfSameBooks : Test 1 failed," + " exp: " + expected + "but got: " + got;

    }

    public static void testBorrowBok() {
        Book b1 = new Book("B1", 1);
        Book b2 = new Book("B2", 2);
        Member manu = new Member("Manu", 12);
        Category classic = new Category();
        classic.addBookToCategory(b1);
        classic.addBookToCategory(b2);
        b1.setAvailable(true);
        b2.setAvailable(false);
        manu.borrowBook(b1);
        manu.borrowBook(b2);

        boolean given;
        boolean expected;
        boolean got;

        // test case1
        expected = true;
        got = manu.borrowBook(b1);
        assert (got == expected)
                : "testBorrowBook : Test 1 failed, " + "  exp: " + expected + "but got: " + got;

        // test case 2
        expected = false;
        got = manu.borrowBook(b2);
        assert (got == expected)
                : "testBorrowBook : Test 2 failed, " + "  exp: " + expected + "but got: " + got;

    }

    public static void testNoOfBooksInHand() {

        Book b1 = new Book("B1", 1);
        Book b2 = new Book("B2", 2);
        Member manu = new Member("Manu", 12);
        Category classic = new Category();
        classic.addBookToCategory(b1);
        classic.addBookToCategory(b2);
        b1.setAvailable(true);
        b2.setAvailable(false);
        manu.borrowBook(b1);
        manu.borrowBook(b2);

        int given;
        int expected;
        int got;

        // test case1
        expected = 1;
        got = manu.noOfBooksInHand();
        assert (got == expected) : "BooksInHand : Test 1 failed," + " exp: " + expected + "but got: " + got;

    }

    public static void main(String[] args) {
        Book b1 = new Book("B1", 1);
        Book b2 = new Book("B2", 2);
        Book b3 = new Book("B3", 3);
        Book b4 = new Book("B3", 4);

        Member manu = new Member("Manu", 12);
        Member anu = new Member("Anu", 13);
        Member anandu = new Member("Anandu", 16);

        Category classic = new Category();

        Library l1 = new Library();

        b1.setIssueDate("12-03-23");
        System.out.println(b1.getIssueDate());

        classic.addBookToCategory(b3);
        classic.addBookToCategory(b2);
        classic.addBookToCategory(b4);

        System.out.println(classic.booksInCategory);

        System.out.println(classic.searchBookFromCategory(b3));
        System.out.println(classic.searchBookFromCategory(b1));
        System.out.println(classic.searchBookFromCategory(b2));

        System.out.println("No of books in category: " + classic.noOfBooksInCategory());
        classic.sameBookFromCategory(b3);

        System.out.println("No of same books under category:  " + classic.noOfSameBooks());

        System.out.println(classic.booksInCategory);
        b3.setAvailable(true);
        b2.setAvailable(false);
        b4.setAvailable(true);

        manu.borrowBook(b3);
        manu.borrowBook(b2);
        manu.borrowBook(b4);
        System.out.println("books in manu's hand: " + manu.booksInHand);

        testMemeberID();
        testBookID();
        testSearchBookFromCategory();
        testNoOfBooksInCategory();
        testNoOfSameBooks();
        testBorrowBok();
        testNoOfBooksInHand();
        System.out.println("Test cases passed...");

    }

}
