package ExercicioIniciantesPT1;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        /*
         * Fazer um programa que leia três valores com ponto
         * flutuante de dupla precisão: A, B e C.
         * Em seguida, calcule e mostre:
         * 
         * a) a área do triângulo retângulo que tem A por base
         * e C por altura.
         * 
         * b) a área do círculo de raio C. (pi = 3.14159)
         * 
         * c) a área do trapézio que tem A e B por bases e
         * C por altura.
         * 
         * d) a área do quadrado que tem lado B.
         * 
         * e) a área do retângulo que tem lados A e B.
         */
        Scanner sc1 = new Scanner(System.in);

        double varA = sc1.nextDouble();
        double varB = sc1.nextDouble();
        double varC = sc1.nextDouble();

        double triangulo = (varA * varC) / 2;
        double circulo = 3.14159 * (varC * varC);
        double trapezio = ((varA + varB) * varC) / 2;
        double quadrado = varB * varB;
        double retangulo = varA * varB;

        sc1.close();

        System.out.printf("TRIANGULO: %.3f", triangulo);
        System.out.printf("\nCIRCULO: %.3f", circulo);
        System.out.printf("\nTRAPEZIO: %.3f", trapezio);
        System.out.printf("\nQUADRADO: %.3f", quadrado);
        System.out.printf("\nRETANGULO: %.3f", retangulo);

    }
}
