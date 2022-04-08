package secao5.ExercicioIniciantesPT2;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        /*
         * Você deve fazer um programa que leia um valor qualquer e
         * apresente uma mensagem dizendo em qual dos seguintes
         * intervalos ([0,25], (25,50], (50,75], (75,100])
         * este valor se encontra. Obviamente se o valor não
         * estiver em nenhum destes intervalos,
         * deverá ser impressa a mensagem “Intervalo: ”.
         */
        Scanner sc1 = new Scanner(System.in);

        double valor = sc1.nextDouble();

        sc1.close();

        if (valor < 0.0 || valor > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (valor <= 25.0) {
            System.out.println("Intervalo: [0,25]");
        } else if (valor <= 50.0) {
            System.out.println("Intervalo: (25,50]");
        } else if (valor <= 75.0) {
            System.out.println("Intervalo: (50,75]");
        } else {
            System.out.println("Intervalo: (75,100]");
        }

    }

}