import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        int numPar = 0;
        System.out.println("NUMEROS PARES: ");
        for(int i=0; i<n; i++){
            if (numeros[i]%2==0){
                numPar=numeros[i];
                System.out.print(numPar+" ");
            }
        }
        System.out.println();
        int qPar = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i]% 2 == 0) {
                qPar++;
            }
        }
        System.out.println("QUANTIDADE DE PARES: "+qPar);

        sc.close();
    }
}