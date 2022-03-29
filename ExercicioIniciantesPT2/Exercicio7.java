package ExercicioIniciantesPT2;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        /*
         * Leia 2 valores com uma casa decimal (x e y), que devem
         * representar as coordenadas de um ponto em um plano.
         * A seguir, determine qual o quadrante ao qual pertence o
         * ponto, ou se está sobre um dos eixos cartesianos ou
         * na origem (x = y = 0.0). Se o ponto estiver na origem,
         * escreva a mensagem “Origem”. Se o ponto estiver sobre um
         * dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
         * situação.
         */
        Scanner sc1 = new Scanner(System.in);

        double cordX = sc1.nextDouble();
        double cordY = sc1.nextDouble();

        sc1.close();

        if (cordX == 0.0 && cordY == 0.0) {
            System.out.println("Origem");
        } else if (cordX > 0.0 && cordY > 0.0) {
            System.out.println("Q1");
        } else if (cordX < 0.0 && cordY > 0.0) {
            System.out.println("Q2");
        } else if (cordX < 0.0 && cordY < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

    }

}