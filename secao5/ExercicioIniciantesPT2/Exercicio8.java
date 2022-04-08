package secao5.ExercicioIniciantesPT2;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        /*
         * Leia um valor com duas casas decimais,
         * equivalente ao salário de uma pessoa de Lisarb.
         * Em seguida, calcule e mostre o valor que esta
         * pessoa deve pagar de Imposto de Renda,
         * segundo a tabela abaixo.
         */
        Scanner sc1 = new Scanner(System.in);

        double salario = sc1.nextDouble();

        sc1.close();

        if (salario < 0) {
            System.out.println("Valor Inválido!");
        } else if (salario <= 2000) {
            System.out.println("Isento");
        } else if (salario <= 3000) {
            if (salario == 3000) {
                System.out.println("R$ 80.00");
            } else {
                System.out.println("Isento");
            }
        } else if (salario <= 4500) {
            double ir8 = 80.00;
            double ir18 = ((salario - 3000) * 18) / 100;
            System.out.printf("R$ %.2f", (ir8 + ir18));
        } else {
            double ir8 = 80.00;
            double ir18 = 270.00;
            double ir28 = ((salario - 4500) * 28) / 100;
            System.out.printf("R$ %.2f", (ir8 + ir18 + ir28));
        }
    }

}