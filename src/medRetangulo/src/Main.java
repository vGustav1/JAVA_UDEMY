import entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle x = new Rectangle();

        System.out.println("Enter the Width: ");
        x.Width = sc.nextDouble();
        System.out.println("Enter the Height: ");
        x.Height = sc.nextDouble();


        System.out.println("AREA = "+x.area());
        System.out.println("PERIMETER = "+x.peri());
        System.out.println("DIAGONAL = "+x.diag());


    }
}