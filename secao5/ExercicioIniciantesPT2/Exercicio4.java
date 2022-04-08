package secao5.ExercicioIniciantesPT2;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        /*
         * Leia a hora inicial e a hora final de um jogo.
         * A seguir calcule a duração do jogo, sabendo que o mesmo 
         * pode começar em um dia e terminar em outro,
         * tendo uma duração mínima de 1 hora e máxima de 24 horas.
         */
        Scanner sc1 = new Scanner(System.in);

        int horaInicial = sc1.nextInt();
        int horaFinal = sc1.nextInt();
        sc1.close();

        if (horaInicial > horaFinal) {
            System.out.println("O JOGO DUROU "+
            (24 - (horaInicial - horaFinal))+" HORA(S)");
        }
        else if(horaInicial == horaFinal){
            System.out.println("O JOGO DUROU 24 HORAS(S)");
        }
        else{
            System.out.println("O JOGO DUROU "+
            (horaFinal - horaInicial)+" HORA(S)");
        }

    }

}