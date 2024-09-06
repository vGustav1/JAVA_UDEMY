package entities;

public class Bank {
    private static final int TAX = 5;
    private final int accountNumber;
    private String name;
    private double balance;

    public Bank(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public Bank(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void addDeposity(double balance) {
        this.balance += balance;
    }
    public void removeDeposity(double balance) {
        this.balance -= balance + TAX;
    }
}