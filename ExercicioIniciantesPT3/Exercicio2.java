package ExercicioIniciantesPT3;

import java.util.Scanner;

public class Exercicio2 {

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

        int cordX = sc1.nextInt();
        int cordY = sc1.nextInt();

        while(cordX != 0 && cordY != 0){
            if(cordX > 0 && cordY > 0) {
                System.out.println("primeiro");}
            else if(cordX < 0 && cordY > 0){ 
                System.out.println("segundo");}
            else if(cordX < 0 && cordY < 0){
                System.out.println("terceiro");}
            else{
                System.out.println("quarto");}

            cordX = sc1.nextInt();
            cordY = sc1.nextInt();
        }

        sc1.close();
    }

}
