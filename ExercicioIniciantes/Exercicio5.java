package ExercicioIniciantes;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        /*
         * Fazer um programa para ler o código de uma peça 1,
         * o número de peças 1, o valor unitário de cada peça 1,
         * o código de uma peça 2, o número de peças 2 e o
         * valor unitário de cada peça 2.
         * Calcule e mostre o valor a ser pago.
         */
        Scanner sc1 = new Scanner(System.in);

        int codPc1 = sc1.nextInt();
        int numPc1 = sc1.nextInt();
        double valorPc1 = sc1.nextDouble();

        int codPc2 = sc1.nextInt();
        int numPc2 = sc1.nextInt();
        double valorPc2 = sc1.nextDouble();

        sc1.close();
        System.out.printf("VALOR A PAGAR = R$ %.2f", 
        (valorPc1 * numPc1) + (valorPc2 * numPc2));

    }
}
