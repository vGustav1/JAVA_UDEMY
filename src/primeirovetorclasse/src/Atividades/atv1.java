package Atividades;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros serão? ");
        int n = sc.nextInt();
        int[] vect = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Digite o numero: ");
            vect[i] = sc.nextInt();
            }
        System.out.println("Numeros negativos: ");

        for (int i=0; i<n;i++){
            if (vect[i]< 0){
                System.out.println(vect[i]);
            }
        }


    }
}
