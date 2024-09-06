import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");

        int tamanho = sc.nextInt();
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i<tamanho ;i++){
            vetorA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i<tamanho ;i++){
            vetorB[i] = sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i<tamanho; i++){
            vetorC[i] = vetorA[i]+vetorB[i];
            System.out.println(vetorC[i]);
        }
    }
}