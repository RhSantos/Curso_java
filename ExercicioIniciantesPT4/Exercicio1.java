package ExercicioIniciantesPT4;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        /*
         * Leia um valor inteiro X (1 <= X <= 1000).
         * Em seguida mostre os ímpares de 1 até X,
         * um valor por linha, inclusive o X, se for o caso.
         */
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while(x < 1 || x > 1000){
            x = sc.nextInt();
        }
        System.out.println();
        for(int i = 0; i <= x; i++){
            if(i % 2 != 0) System.out.println(i);
        }
        
        sc.close();
    }
}