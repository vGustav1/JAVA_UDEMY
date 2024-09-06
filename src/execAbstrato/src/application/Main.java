package application;

import entitites.Contribuinte;
import entitites.PessoaFisica;
import entitites.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();

            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double gastoSaude = sc.nextDouble();
                list.add(new PessoaFisica(name,rendaAnual,gastoSaude));
            }
            else {
                System.out.print("Number of employees: ");
                int funcionarios = sc.nextInt();
                list.add(new PessoaJuridica(name,rendaAnual,funcionarios));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Contribuinte contribuinte : list){
            System.out.println(String.format(contribuinte.getName()+": $ "+"%.2f", contribuinte.taxaTotal()));
        }
        System.out.print("TOTAL TAXES: $ ");

        double sum = 0.0;
        for (Contribuinte contribuinte : list){
            sum += contribuinte.taxaTotal();
        }
        System.out.println(sum);


    }
}