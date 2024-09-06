package application;

import util.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.println("Circumference: "+c);
        System.out.println("Volume: "+v);
        System.out.println("PI value: "+Calculator.PI);
    }
}