package JavaPOO.ExercicioFixacao3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        aluno.setNome(sc.next());
        aluno.setNota1tri(sc.nextDouble());
        aluno.setNota2tri(sc.nextDouble());
        aluno.setNota3tri(sc.nextDouble());

        System.out.printf("FINAL nota: %.2f%n", aluno.notaFinal());
        if (aluno.notaFinal() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    
    }

}
