package ExercicioIniciantes;

import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double pi = 3.14159;
        double x = sc1.nextDouble();
        sc1.close();
        System.out.print("A=");
        System.out.printf("%.2f",(x*pi));

    }

}
