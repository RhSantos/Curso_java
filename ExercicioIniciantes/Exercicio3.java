package ExercicioIniciantes;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        /*
         * Fazer um programa para ler quatro valores inteiros
         * A, B, C e D. A seguir, calcule e mostre a diferença 
         * do produto de A e B pelo produto de C e D 
         * segundo a fórmula: DIFERENCA = (A * B - C * D).
         */
        Scanner sc1 = new Scanner(System.in);
        int varA = sc1.nextInt();
        int varB = sc1.nextInt();
        int varC = sc1.nextInt();
        int varD = sc1.nextInt();
        sc1.close();
        System.out.println("DIFERENCA = " + (varA * varB - varC * varD));

    }

}
