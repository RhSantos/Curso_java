package secao4.ExercicioIniciantesPT1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        /*
         * Faça um programa para ler dois valores inteiros,
         * e depois mostrar na tela a
         * soma desses números com uma
         * mensagem explicativa, conforme exemplos.
         */
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int y = sc1.nextInt();
        sc1.close();
        System.out.println("SOMA = " + (x + y));
    }

}
