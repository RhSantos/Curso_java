package ExercicioIniciantesPT1;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        /*
         * Fazer um programa que leia o número de um funcionário,
         * seu número de horas trabalhadas, o valor que recebe por
         * hora e calcula o salário desse funcionário.
         * A seguir, mostre o número e o salário do funcionário,
         * com duas casas decimais.
         */
        Scanner sc1 = new Scanner(System.in);
        int numFunc = sc1.nextInt();
        int horasTrab = sc1.nextInt();
        double horasValor = sc1.nextDouble();
        sc1.close();
        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f", (horasTrab * horasValor));

    }
}
