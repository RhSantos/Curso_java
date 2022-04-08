package secao5.ExercicioIniciantesPT2;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        /*
         * Fazer um programa para ler um número inteiro,
         * e depois dizer se este número é negativo ou não.
         */
        Scanner sc1 = new Scanner(System.in);

        int num = sc1.nextInt();
        sc1.close();

        if (num < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

    }

}