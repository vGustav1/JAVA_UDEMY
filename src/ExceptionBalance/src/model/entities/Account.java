package model.entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDraw;


    public Account (){
    }
    public Account(Integer number, String holder, Double balance, Double withDraw) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDraw = withDraw;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithDraw() {
        return withDraw;
    }

    public void setWithDraw(Double withDraw) {
        this.withDraw = withDraw;
    }

    public void deposit (Double amount){
        balance += amount;
    }
    public void withdraw (Double amount){
        balance -= amount;
    }
}
