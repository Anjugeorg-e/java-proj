package personbankmanagement;

import javax.crypto.spec.DESKeySpec;

public class Main {

    public static void testSetAddress(String addr){
        Person ann = new Person(23, "ann", "Female");
        // ann.setAddress("addr");
        // assert (addr == ann.getAddress()) : "Set address is failed " ;

        String given;
        String expected;
        String got;

        //test case1
        given ="office";
        expected = "office";
        ann.setAddress(given);
        got = ann.getAddress();
        assert (got == expected) : "setAddress : Test 1 failed,  given :" + given + " exp: " + expected + "but got: " + got;
    
        //tet case2
        
    }

    public static void testAge(){
        int given;
        int expected;
        int got;
        Person ann = new Person(0, "ann", "Female");

        // test case 1
        given = 0;
        expected =0;
        ann.setAge(given);
        got = ann.getAge();
        assert (got == expected) : "setage: Test case1 failed, given:" + given +" exp: " + expected + " but got: " + got;
        
        // test case2
        given =expected= 15;
        ann.setAge(given);
        got=ann.getAge();
        assert (got == expected) : "Setage : Test case2 failed ,given " + given + " exp: " + expected + " but got: " + got;
   
        //test case3
        given = 10;
        // expected =15;
        ann.setAge(given);
        got = ann.getAge();
        assert (got == expected) : "Setage : Test case3 failed ,given " + given + " exp: " + expected + " but got: " + got;
   
    }

    public static void testGender(){

        String given;
        String expected;
        String got;
        Person ann = new Person(0, "ann", "Female");

        //test case1
        given = "Female";
        expected="Female";
        ann.setGender(given);
        got = ann.getGender();
        assert (got == expected) : "setGender : Test case 1 failed, given " + given + " exp: " + expected + " but got: " + got;

        //test case2
        given ="newgender";
        ann.setGender(given);
        got = ann.getGender();
        assert (got == expected) : "setGender : Test case 2 failed, given " + given + " exp: " + expected + " but got: " + got;

    }

    public static void testEmail(){

        String given;
        String expected;
        String got;
        Person ann = new Person(0, "ann", "Female");

        //test case1
        given ="abc@gm.com";
        expected="abc@gm.com";
        ann.setEmail(given);
        got= ann.getEmail();
        assert (got == expected) : "setEmail : Test case 1 failed, given " + given + "exp: " + expected + "but got : " + got;

         //test case2
         given ="abcgm.com";
        //  expected="abcgm.com";
         ann.setEmail(given);
         got= ann.getEmail();
         assert (got == expected) : "setEmail : Test case 2 failed, given " + given + "exp: " + expected + "but got : " + got;
 
    }

    public static void testjobTitle(){
        String given;
        String expected;
        String got;
        Person ann = new Person(0, "ann", "Female");

        //test case 1

        given ="developer";
        expected = "developer";
        ann.setJobTitle(given);
        got = ann.getJobTitle();
        assert (got == expected) : "setJobTitle : Test case 1 failed , given " + given + " exp: " + expected + " but got, " + got;

    }

    public static void testIsAdult(){

        boolean given;
        boolean expected;
        boolean got;
        Person ann = new Person(23, "ann", "Female");

        //test case 1
       given=true;
        expected=true;
        got=ann.isAdult();
        assert (got ==  expected) : "isAdult : Test case1 failed, given " + given + " exp: " + expected + "but got : " + got;

        
        //test case2       
        expected=true;
        
        ann.setAge(13);
        got = ann.isAdult();
        assert (got == expected) : "isAdult : Test case2 failed, given " + given + " exp: " + expected + " but got, " + got;

        
    }

    public static void testHasFriend(){
        boolean expected;
        String given;
        boolean got;
        Person ann= new Person(13, "ann", "Female");
        Person nithya = new Person(43, "Nithya", "female");
       
        ann.addFriend(nithya);
      
        //test case 1
        expected = true;
        given = "Nithya";
        got= ann.hasFriend(given);
        assert (got == expected) : "hasFriend  : Test case1 failed, given " + given + " exp: " + expected + " but got, " + got;
        
      //  test case 2
        expected = false;
        given = "nivya";
        got= ann.hasFriend(given);
        assert (got == expected) : "hasFriend  : Test case3 failed, given " + given + " exp: " + expected + " but got, " + got;

        
    }

    public static void testSetInterestRate(){
        double given;
        double expected;
        double got;
        Person ann = new Person(23, "ann", "Female");
        BankAccount acc =new BankAccount("7645454", 32000, ann);

        // test case 1
        given = 2.3;
        expected =2.3;
        acc.setInterestRate(given);
        got=acc.getInterestRate();
        assert (got == expected) : "testInterestRate: Test case1 failed, given:" + given +" exp: " + expected + " but got: " + got;
       
        //test case 2

        given = 0;
        expected =0;
        acc.setInterestRate(given);
        got=acc.getInterestRate();
        assert (got == expected) : "testInterestRate: Test case2 failed, given:" + given +" exp: " + expected + " but got: " + got;
       
        //test case3 

        given = -1;
        expected =-1;
        acc.setInterestRate(given);
        got=acc.getInterestRate();
        assert (got == expected) : "testInterestRate: Test case3 failed, given:" + given +" exp: " + expected + " but got: " + got;
       
    }

    public static void testDeposit(){
        double given;
        double expected;
        double got;
        Person ann = new Person(23, "ann", "Female");
        BankAccount acc =new BankAccount("7645454", 32000.0, ann);

        //test case1
        given = 2000.0;
        expected=34000.0;
        got = acc.deposit(given);
        assert (got == expected) : "testDeposit: Test case1 failed, given:" + given +" exp: " + expected + " but got: " + got;
       
        //test case2
        given = -1;
        got= acc.deposit(given);
        assert (got == expected) : "testDeposit: Test case2 failed, given:" + given +" exp: " + expected + " but got: " + got;
       
    }

    public static void testWithdraw(){
        boolean expected;
        double given;
        boolean got;
        Person ann= new Person(13, "ann", "Female");
        BankAccount acc =new BankAccount("7645454", 32000.0, ann);

        //test case1
        given = 2000;
        expected=true;
        got=acc.withdraw(given);
        assert (got == expected) : "testWithdraw: Test case1 failed, given:" + given +" exp: " + expected + " but got: " + got;
       
        //test case2
        given=34000;
        expected=false;
        got=acc.withdraw(given);
        assert (got == expected) : "testWithdraw: Test case2 failed, given:" + given +" exp: " + expected + " but got: " + got;
       
       //test case 3
        given=29500;
        got=acc.withdraw(given);
        assert (got == expected) : "testWithdraw: Test case3 failed, given:" + given +" exp: " + expected + " but got: " + got;
       
    }

    public static void testAddInterest(){
        double given;
        double expected;
        double got;
        Person ann = new Person(23, "ann", "Female");
        BankAccount acc =new BankAccount("7645454", 32000.0, ann);

        //test case1
        given = 2;
        expected=160000;
        acc.setInterestRate(2.5);
        got = acc.addInterest(given);
        assert (got == expected) : "testAddInterest: Test case1 failed, given:" + given +" exp: " + expected + " but got: " + got;
       

    }

    public static void testTransferAmount(){
        int given;
        boolean expected;
        boolean got;
        Person ann = new Person(23, "ann", "Female");
        Person mary = new Person(35, "mary", "Female");
        BankAccount acc =new BankAccount("7645454", 32000.0, ann);
        BankAccount maryAccountOne = new BankAccount("7854567", 2300, mary);
       
        //test case 1
        given = 2000;
        expected=true; 
        got = acc.transferAmount(maryAccountOne, given);
        assert (got == expected) : "testTransferAmount: Test case1 failed, given:" + given +" exp: " + expected + " but got: " + got;
    
        //test case2
        given = 34000;
        expected=false; 
        got = acc.transferAmount(maryAccountOne, given);
        assert (got == expected) : "testTransferAmount: Test case2 failed, given:" + given +" exp: " + expected + " but got: " + got;
    
        //test cae 3
        given = 29500;
        expected=false; 
        got = acc.transferAmount(maryAccountOne, given);
        assert (got == expected) : "testTransferAmount: Test case3 failed, given:" + given +" exp: " + expected + " but got: " + got;
    
    }

    public static void testGetTotalBalance(){
        Person mary = new Person(35, "mary", "Female");       
        Bank bank = new Bank();
        BankAccount maryAccountOne = new BankAccount("7854567", 2300, mary);
        bank.addAccount(maryAccountOne);

        int given;
        double expected;
        double got;
        
        //test case 1
        given=2300;
        expected = 2300;
        got =bank.getTotalBalance();
        assert (got == expected) : "testGetTotalt: Test TotalBalance case1 failed, given:" + given +" exp: " + expected + " but got: " + got;
        
        //test case2
        Person poppy = new Person(25, "poppy", "Female");
        BankAccount poppyAccountOne = new BankAccount("6543449", 10000, poppy);
        bank.addAccount(poppyAccountOne);
       
        expected = 12300;
        got =bank.getTotalBalance();
        assert (got == expected) : "testGetTotalt: Test TotalBalance case2 failed, given:" + given +" exp: " + expected + " but got: " + got;
    
    }

    public static void testGetAverageBalance(){
        Person mary = new Person(35, "mary", "Female");       
        Bank bank = new Bank();
        BankAccount maryAccountOne = new BankAccount("7854567", 2300, mary);
        bank.addAccount(maryAccountOne);

        int given;
        double expected;
        double got;
        
        //test case 1
        given=2300;
        expected = 2300;
        got =bank.getAverageBalance();
        assert (got == expected) : "testGetAverage: Test TotalAverage case1 failed, given:" + given +" exp: " + expected + " but got: " + got;
        
        //test case 2
        Person poppy = new Person(25, "poppy", "Female");
        BankAccount poppyAccountOne = new BankAccount("6543449", 10000, poppy);
        bank.addAccount(poppyAccountOne);
       
        expected = 6150;
        got =bank.getAverageBalance();
        assert (got == expected) : "testGetAverage Test TotalAVerage case2 failed, given:" + given +" exp: " + expected + " but got: " + got;
    
    }

    public static void testTotalBalanceOfSamePerson(){
        Person mary = new Person(35, "mary", "Female");       
        Bank bank = new Bank();
        BankAccount maryAccountOne = new BankAccount("7854567", 2300, mary);
        bank.addAccount(maryAccountOne);
        
        double given;
        double expected;
        double got;
        
        //test case 1
        given=2300;
        expected = 2300;
        got =bank.totalBalanceOfSamePerson(mary);
        assert (got == expected) : "testTotalBalanceOfSamePersonACcount: Test Totalbalance case1 failed, given:" + given +" exp: " + expected + " but got: " + got;
        
        
        //test case 2
        
        BankAccount maryAccountTwo = new BankAccount("7854467", 27800, mary);
        bank.addAccount(maryAccountTwo);
        expected = 30100;
        got =bank.totalBalanceOfSamePerson(mary);
        assert (got == expected) : "testTotalBalanceOfSamePersonACcount: Test Totalbalance case2 failed, given:" + given +" exp: " + expected + " but got: " + got;
        
    }

    public static void testAverageBalanceOfSamePerson(){
        Person mary = new Person(35, "mary", "Female");       
        Bank bank = new Bank();
        BankAccount maryAccountOne = new BankAccount("7854567", 2300, mary);
        bank.addAccount(maryAccountOne);
        
        double given;
        double expected;
        double got;
        
        //test case 1
        given=2300;
        expected = 2300;
        got =bank.averageBalanceOfSamePerson(mary);
        assert (got == expected) : "testAverageBalanceOfSamePersonACcount: Test AVeragebalance case1 failed, given:" + given +" exp: " + expected + " but got: " + got;
        
        
        //test case 2
        BankAccount maryAccountTwo = new BankAccount("7854467", 27800, mary);
        bank.addAccount(maryAccountTwo);
        expected = 15050;
        got =bank.averageBalanceOfSamePerson(mary);
        assert (got == expected) : "testAverageBalanceOfSamePersonACcount: Test Averagebalance case2 failed, given:" + given +" exp: " + expected + " but got: " + got;
        
    }

    public static void main(String[] args) {

        Person ann = new Person(23, "ann", "Female");

        // assert 3 == 4: "failed to assert ann's age";
        System.out.println(ann.getAge());

        System.out.println(ann.getGender());
        // assert ann.getGender() == "Male" : " assert failed to load gender";

        System.out.println(ann.getName());
        // assert ann.getName() == "moni" : "failed to assert anjus name";
        ann.greet();

        // assert ann.isAdult()==false : "failed to find adulttype";
        System.out.println("Ann adult or not ? " + ann.isAdult());

        Person nithya = new Person(43, "Nithya", "female");
        Person happy = new Person(22, "happy", "Male");
        Person mary = new Person(35, "mary", "Female");
        Person poppy = new Person(25, "poppy", "Female");

        ann.addFriend(nithya);
        ann.addFriend(happy);
        ann.addFriend(mary);
        ann.addFriend(poppy);
        ann.removeFriend(happy);
        System.out.println(ann.friends);

        System.out.println(ann.hasFriend("poppy"));
        // assert ann.hasFriend("sam") : "sam is not a friend";

        nithya.setJobTitle("software developer");
        System.out.println(nithya.getJobTitle());
        // assert friend1.getJobTitle() == "Tester" : "not a developer";

        ann.introduce();
        ann.printFriends();

        Bank bank = new Bank();

        BankAccount nithyaAccountOne = new BankAccount("1234567", 23000, nithya);
        // System.out.println(friend1account.getOwner());
        BankAccount maryAccountOne = new BankAccount("7854567", 2300, mary);
        BankAccount poppyAccountOne = new BankAccount("6543449", 56890, poppy);
        BankAccount nithyaAccountTwo = new BankAccount("1234967", 23000, nithya);
        BankAccount nithyaAccountThree = new BankAccount("1238567", 23000, nithya);
        BankAccount maryAccountTwo = new BankAccount("7854467", 27800, mary);

        bank.addAccount(nithyaAccountOne);
        bank.addAccount(maryAccountOne);
        bank.addAccount(poppyAccountOne);
        bank.addAccount(nithyaAccountTwo);
        bank.addAccount(nithyaAccountThree);
        bank.addAccount(maryAccountTwo);
        // bank.removeAccount(friend3secondaccount);
        System.out.println(bank.accounts);
        System.out.println(nithyaAccountOne.getAccountNumber());
        System.out.println(nithyaAccountOne .getOwner().getName());

        nithyaAccountOne.setInterestRate(0);

        System.out.println("Total balance of bank is: " + bank.getTotalBalance());
        System.out.println("Average balance of bank is: " +
        bank.getAverageBalance());
        // bank.payDividends(1000);

        System.out.println(nithyaAccountOne.transferAmount(maryAccountOne, 2000));
        System.out.println(nithyaAccountOne.getBalance());
        System.out.println(maryAccountOne.getBalance());

        bank.accountsBasedOnAge(35);
        System.out.println("Total accunt balance of a person holding multiple accounts: " + bank.totalBalanceOfSamePerson(mary));
        System.out.println("Average balance of a person holding multiple accunts : "+
        bank.averageBalanceOfSamePerson(mary));


        
        testSetAddress("addr");
        testAge();
        testGender();
        testEmail();
        testjobTitle();
        testIsAdult();
        testHasFriend();
        testSetInterestRate();
        testDeposit();
        testWithdraw();
        testAddInterest();
        testTransferAmount();
        testGetTotalBalance();
        testGetAverageBalance();
        testTotalBalanceOfSamePerson();
        testAverageBalanceOfSamePerson();

        System.out.println("test case passed");

    }
}
