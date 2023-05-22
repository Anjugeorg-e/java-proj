package account;

public class Main {
    public static void main(String[] args) {
        Account ac1 = new Account("102", "kjh", 23004);
        Account ac2 = new Account("23", "jhu", 43255);

        ac1.credit(3400);
        System.out.println(ac1.getBalance());

        ac1.debit(27000);
        System.out.println(ac1.getBalance());

        ac1.transferTo(ac2, 2300);
        System.out.println(ac2.getBalance());
        System.out.println(ac1.getBalance());
    }
}
