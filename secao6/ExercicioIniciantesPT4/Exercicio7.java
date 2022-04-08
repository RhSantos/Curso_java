package secao6.ExercicioIniciantesPT4;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        /*
         * Fazer um programa para ler um número inteiro
         * positivo N. O programa deve então mostrar na
         * tela N linhas, começando de 1 até N.
         * Para cada linha, mostrar o número da linha,
         * depois o quadrado e o cubo do valor, conforme
         * exemplo.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++){
            int quadrado = (int)Math.pow(i, 2);;
            int cubo = (int)Math.pow(i, 3);
            System.out.printf("%d %d %d\n",i,quadrado,cubo);
        }

        sc.close();
    }
}
