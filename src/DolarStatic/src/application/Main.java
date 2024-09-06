package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dollar price: " );
        double price = sc.nextDouble();
        System.out.println("Dollar will be bought: ");
        double amount = sc.nextDouble();


        double r = CurrencyConverter.dollarToReal(amount, price);
        System.out.printf("Amount to be paid in reais = %.2f%n",r);


    }
}