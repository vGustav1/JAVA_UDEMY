import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Quantas pessoas serão digitadas: ");
        n = sc.nextInt();

        String[] name = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa ");
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += altura[i];
        }
        double avg = soma / altura.length;
        System.out.println("Altura media " + avg);

        int porcentagem = 0;
        int menores = 0;
        String nomesMenores;

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                menores++;
                porcentagem = (100 * menores / n);

            }
        }
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                nomesMenores = name[i];
                System.out.println(nomesMenores);
            }
        }
        sc.close();
    }
}