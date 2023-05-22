package account;

import org.junit.runner.notification.RunListener.ThreadSafe;

public class Account {
    private String id;
    private String name;
    private int balance;


    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID(){
        return id; 
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        balance = balance+amount;
        return balance;
    }
    public int debit(int amount){
        if(amount <= balance){
          balance=  balance - amount;
        }
          else{
            System.out.println("amount exeeded the balance ");
        }  
        return balance; 
    }
    public int transferTo(Account acc, int amount){
        if(amount <= this.balance){
            acc.balance += amount;
            this.balance -= amount;
        }else{
            System.out.println("AMount exeeded the balance");
        }
        return balance;
    }
}
