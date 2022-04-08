package secao6.ExercicioIniciantesPT4;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
         * Ler um valor N. Calcular e escrever seu
         * respectivo fatorial.
         * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... *1.
         * Lembrando que, por definição, fatorial de 0 é 1.
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = n;

        for(int i=1;i<n;i++){
            fatorial *= i;
        }

        if(n == 0 || n == 1) fatorial = 1;

        System.out.println(fatorial);

        sc.close();
    }
}
