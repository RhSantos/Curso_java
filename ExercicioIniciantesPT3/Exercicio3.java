package ExercicioIniciantesPT3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        /*
         * Escreva um programa para ler as coordenadas (X,Y) de
         * uma quantidade indeterminada de pontos no sistema
         * cartesiano. Para cada ponto escrever o quadrante a que
         * ele pertence. O algoritmo será encerrado quando pelo
         * menos uma de duas coordenadas for NULA
         * (nesta situação sem escrever mensagem alguma).
         */
        Scanner sc1 = new Scanner(System.in);

        int opcao = sc1.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(opcao != 4){
            switch(opcao){
            case 1: 
                alcool++;
                break;
            case 2: 
                gasolina++;
                break;
            case 3: 
                diesel++;
                break;
            }
            opcao = sc1.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);

        sc1.close();
    }

}
