package ExercicioIniciantesPT4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
         * Leia 1 valor inteiro N, que representa o
         * número de casos de teste que vem a seguir.
         * Cada caso de teste consiste de 3 valores reais,
         * cada um deles com uma casa decimal.
         * Apresente a média ponderada para cada um destes
         * conjuntos de 3 valores, sendo que o primeiro valor
         * tem peso 2, o segundo valor tem peso 3 e o
         * terceiro valor tem peso 5.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();
            double media =((nota1*2)+(nota2*3)+(nota3*5))/10; 
            System.out.printf("%.1f\n",media);
        }

        sc.close();
    }
}
