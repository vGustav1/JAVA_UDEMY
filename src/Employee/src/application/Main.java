package application;

import entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Name: ");
        emp.name = sc.nextLine();

        System.out.println("Gross salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        emp.Tax = sc.nextDouble();

        System.out.println(emp);
        System.out.println();
        System.out.printf("Which percentage to increase salary? ");

        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("Update data: "+emp);


















    }

}