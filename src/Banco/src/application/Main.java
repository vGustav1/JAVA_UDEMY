package application;
import entities.Bank;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter the account holder: ");
        String name = sc.next();

        System.out.print("Is there na initial deposit (y/n): ");
        char yn = sc.next().charAt(0);

        Bank bank = new Bank (accountNumber, name);

        if(yn == 'n'){
            double balance = 0;
        }else {
            System.out.println("Enter initial deposit value: ");
            bank.setBalance(sc.nextDouble());
        }



        System.out.println("Account data: ");
        System.out.println("Account: "+accountNumber+", Holder: "+name+", Balance: "+bank.getBalance());

        System.out.println("Enter a deposit value: ");
        double balance = sc.nextDouble();
        bank.addDeposity(balance);

        System.out.println("Account data: ");
        System.out.println("Account: "+accountNumber+", Holder: "+name+", Balance: "+bank.getBalance());

        System.out.println("Enter a withdraw value: ");
        balance = sc.nextDouble();
        bank.removeDeposity(balance);

        System.out.println("Update data: ");
        System.out.println("Account: "+accountNumber+", Holder: "+name+", Balance: "+bank.getBalance());








    }
}