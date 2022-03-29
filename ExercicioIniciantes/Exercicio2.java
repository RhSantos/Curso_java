package ExercicioIniciantes;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        /*
            Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
            casas decimais conforme exemplos.
        */
        Scanner sc1 = new Scanner(System.in);
        double pi = 3.14159;
        double x = sc1.nextDouble();
        sc1.close();
        System.out.print("A=");
        System.out.printf("%.4f",(x*pi));

    }

}
