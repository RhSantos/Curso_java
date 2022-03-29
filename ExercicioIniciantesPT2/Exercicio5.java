package ExercicioIniciantesPT2;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        /*
         * Com base na tabela abaixo, escreva um programa que
         * leia o código de um item e a quantidade deste item.
         * A seguir, calcule e mostre o valor da conta a pagar.
         */
        Scanner sc1 = new Scanner(System.in);

        int codItem = sc1.nextInt();
        int quatItem = sc1.nextInt();
        sc1.close();

        if (codItem == 1) {
            System.out.printf("Total: R$ %.2f", 4.00 * quatItem);
        } else if (codItem == 2) {
            System.out.printf("Total: R$ %.2f", 4.50 * quatItem);
        } else if (codItem == 3) {
            System.out.printf("Total: R$ %.2f", 5.00 * quatItem);
        } else if (codItem == 4) {
            System.out.printf("Total: R$ %.2f", 2.00 * quatItem);
        } else if (codItem == 5) {
            System.out.printf("Total: R$ %.2f", 1.50 * quatItem);
        } else {
            System.out.println("Não há um item com esse código!");
        }

    }

}