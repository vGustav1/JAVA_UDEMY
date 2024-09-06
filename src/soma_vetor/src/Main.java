import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        double soma, avg;
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o numero: ");
            vect[i] = sc.nextInt();
        }
            soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }         avg = soma / n;
        System.out.print("Valores = ");

        for (int i = 0; i < n; i++) {
            System.out.print(vect[i]+" ");
        }
                System.out.println("\nSoma: " + soma);
                System.out.println("Media: " + avg);
        }
    }
