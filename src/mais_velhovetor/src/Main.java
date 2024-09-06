import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];


        for (int i = 0; i<n; i++){
            System.out.println("Digite o nome da "+(i+1)+"a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int maioridade = idade[0];
        int posciaoMaior = 0;

        for (int i = 0; i<n; i++){
            if (idade[i] > maioridade){
                maioridade = idade[i];
                posciaoMaior = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: "+nome[posciaoMaior]);
        sc.close();
    }
}