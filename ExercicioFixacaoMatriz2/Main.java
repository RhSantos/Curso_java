package ExercicioFixacaoMatriz2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de Linhas da Matriz");
        int m = sc.nextInt();
        System.out.println();
        System.out.println("Digite a quantidade de Colunas da Matriz");
        int n = sc.nextInt();
        System.out.println();

        int[][] matriz = new int[m][n];

        System.out.println("Gerando a Matriz com Números Aleatórios...");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(1+Math.random()*49);
            }
        }

        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
        System.out.println("\nDigite um número para mostrar seus vizinhos");
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
