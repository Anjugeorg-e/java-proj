package personbankmanagement;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String ownerName;
    private Person owner;
    private double interestRate;
    private double newBalance;
    private boolean isActive;
    private final int minBalance = 1000;

    BankAccount(String accountNumber, double balance, Person owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
        return balance;
    }

    public boolean withdraw(double amount) {
        if (((balance < amount) || (balance - amount) <= minBalance)) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public double addInterest(double year) {
        if (year > 0) {

            balance = balance * interestRate * year;
        }
        return balance;

    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", owner=" + owner + "]";
    }

    public boolean transferAmount(BankAccount account, int amount) {
        if ((balance < amount) || (balance - amount) <= minBalance) {
            return false;
        }
        balance -= amount;
        account.balance += amount;
        return true;
    }

}
