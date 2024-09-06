import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos elementos terá o vetor: ");
        int n;
        n = sc.nextInt();
        int[] vetor = new int[n];
        int somaPares = 0;
        int quantidadePares = 0;

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                quantidadePares++;
            }
        }
        if (somaPares > 0) {
            int avg = somaPares / quantidadePares;
            System.out.print("Média dos números pares: "+ avg);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
        sc.close();
        }
    }
