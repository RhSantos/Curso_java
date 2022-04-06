package ExercicioFixacaoMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 2;
            }
        }

        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }

        int x = sc.nextInt();
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == x) {
                    if(i == 0 && j == 0){
                        System.out.println("Posição "+i+","+j);
                        System.out.println("Baixo: "+matriz[i+1][j]);
                        System.out.println("Direita: "+matriz[i][j+1]);
                        System.out.println();
                    }
                    else if (i == matriz.length-1 && j == matriz[i].length-1){
                        System.out.println("Posição "+i+","+j);
                        System.out.println("Cima: "+matriz[i-1][j]);
                        System.out.println("Esquerda: "+matriz[i][j-1]);
                        System.out.println();
                    }
                    else if (i == matriz.length-1 && j == 0){
                        System.out.println("Posição "+i+","+j);
                        System.out.println("Cima: "+matriz[i-1][j]);
                        System.out.println("Direita: "+matriz[i][j+1]);
                        System.out.println();
                    }
                    else if (i == 0 && j == matriz[i].length-1){
                        System.out.println("Posição "+i+","+j);
                        System.out.println("Baixo: "+matriz[i+1][j]);
                        System.out.println("Esquerda: "+matriz[i][j-1]);
                        System.out.println();
                    }
                    else if(i == 0 && j > 0 && j < matriz[i].length-1){
                        System.out.println("Posição "+i+","+j);
                        System.out.println("Baixo: "+matriz[i+1][j]);
                        System.out.println("Esquerda: "+matriz[i][j-1]);
                        System.out.println("Direita: "+matriz[i][j+1]);
                        System.out.println();
                    }
                    else if(j == 0 && i > 0 && i < matriz.length-1){
                        System.out.println("Posição "+i+","+j);
                        System.out.println("Cima: "+matriz[i-1][j]);
                        System.out.println("Baixo: "+matriz[i+1][j]);
                        System.out.println("Direita: "+matriz[i][j+1]);
                        System.out.println();
                    }

                    else if(i == matriz.length-1 && j > 0 && j < matriz[i].length-1){
                        System.out.println("Posição "+i+","+j);
                        System.out.println("Cima: "+matriz[i-1][j]);
                        System.out.println("Esquerda: "+matriz[i][j-1]);
                        System.out.println("Direita: "+matriz[i][j+1]);
                        System.out.println();
                    }

                    else if(j == matriz.length-1 && i > 0 && i < matriz[i].length-1){
                        System.out.println("Posição "+i+","+j);
                        System.out.println("Cima: "+matriz[i-1][j]);
                        System.out.println("Baixo: "+matriz[i+1][j]);
                        System.out.println("Esquerda: "+matriz[i][j-1]);
                        System.out.println();
                    }

                    else{
                        System.out.println("Posição "+i+","+j);
                        System.out.println("Cima: "+matriz[i-1][j]);
                        System.out.println("Baixo: "+matriz[i+1][j]);
                        System.out.println("Esquerda: "+matriz[i][j-1]);
                        System.out.println("Direita: "+matriz[i][j+1]);
                        System.out.println();
                    }
                }
            }
        }

        sc.close();   

    }
}
