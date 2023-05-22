package personbankmanagement;

import java.util.ArrayList;

public class Bank {

    private int size;
    ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void removeAccount(BankAccount account) {
        accounts.remove(account);
    }

    public double getTotalBalance() {
        double sumTotal = 0;
        for (BankAccount account : accounts) {
            sumTotal += account.getBalance();
        }
        return sumTotal;
    }

    public double getAverageBalance() {
        size = accounts.size();
        double avg = getTotalBalance() / size;
        return avg;
    }

    public void payDividends(double amount) {
        if(amount > 0){

            double dividendAccount;
            double dividend = amount / getTotalBalance();
            for (BankAccount account : accounts) {
                dividendAccount = account.getBalance() * dividend;
                // return dividendAccount;
                System.out.println("Dividend  for account " + account.getAccountNumber() + " = " + dividendAccount);
        }

        }
    }

    public void accountsBasedOnAge(int age) {
        if(age>0){

            for (BankAccount account : accounts) {
                if (age >= (account.getOwner().getAge())) {
    
                    System.out.println(" account owner below the given age : " + account.getOwner().getName()
                            + " , Account number:  " + account.getAccountNumber());
                }
    
            }
        }
    }

    public double totalBalanceOfSamePerson(Person person) {
        double sum = 0;
        for (BankAccount account : accounts) {
            if (account.getOwner() == person) {
                sum += account.getBalance();
            }
        }
        return sum;
    }

    public double averageBalanceOfSamePerson(Person person) {
        ArrayList<Person> samePersonAccount = new ArrayList<>();
        double average = 0;
        for (BankAccount account : accounts) {
            if (account.getOwner() == person) {
                samePersonAccount.add(person);
                int sizeOfNewAccount = samePersonAccount.size();
                average = totalBalanceOfSamePerson(person) / sizeOfNewAccount;
            }
        }
        return average;
    }

}
