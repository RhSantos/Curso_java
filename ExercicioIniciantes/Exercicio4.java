package ExercicioIniciantes;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int numFunc = sc1.nextInt();
        int horasTrab = sc1.nextInt();
        double horasValor = sc1.nextDouble();
        sc1.close();
        System.out.println("NUMBER = " + numFunc); 
        System.out.print("SALARY = U$ ");
        System.out.printf("%.2f",(horasTrab*horasValor));

    }
}
