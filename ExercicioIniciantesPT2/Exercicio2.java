package ExercicioIniciantesPT2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        /*
         * Fazer um programa para ler um número inteiro e
         * dizer se este número é par ou ímpar.
         */
        Scanner sc1 = new Scanner(System.in);

        int num = sc1.nextInt();
        sc1.close();

        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

    }

}