import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        double soma = 0;
        for (int i=0; i<n;i++){
            soma+=vect[i];
        }
        double abaixoMedia = 0;
        double avg = soma / vect.length;
        System.out.printf("MEDIA DO VETOR "+avg);
        System.out.println();
        for (int i=0; i<n;i++){
            if (vect[i]<avg){
                abaixoMedia=vect[i];
                System.out.println(abaixoMedia);
            }
        }
    }
}