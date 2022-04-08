package secao10.ExercicioFixacaoMatrizes;

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

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite um valor a ser adicionado na matriz");
                matriz[i][j] = sc.nextInt();
                System.out.println();
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
                    System.out.println("Posição (" + i + "," + j + ") :");
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Cima: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Baixo: " + matriz[i+1][j]);
					}
                    System.out.println();
                }
            }
        }

        sc.close();   

    }
}
