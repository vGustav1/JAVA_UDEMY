package application;
import entities.Aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Enter the student name: ");
        aluno.name = sc.nextLine();
        System.out.println("Enter the notes: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        if (aluno.finalGrade()>=60){
            System.out.println("Final Grade = "+aluno.finalGrade()+"\nPass");
        }else {
            System.out.println("Final Grade = "+aluno.finalGrade()+"\nFailed\nMissing"+aluno.missingPoints()+" Points");
        }


    }
}