package ExercicioIniciantesPT2;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        /*
         * Leia 2 valores inteiros (A e B). Após, o programa
         * deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
         * Multiplos", indicando se os valores lidos são
         * múltiplos entre si. Atenção: os números devem poder ser
         * digitados em ordem crescente ou decrescente.
         */
        Scanner sc1 = new Scanner(System.in);

        int numA = sc1.nextInt();
        int numB = sc1.nextInt();
        sc1.close();

        if (numA > numB) {
            if (numA % numB == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }

        else {
            if (numB % numA == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }

    }

}