package ExercicioFixacaoMatriz1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da Matriz!\n");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.println("\nDigite um valor para acrescentar na Matriz!");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nA Diagonal Principal é:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int numerosNegativos = 0;

		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					numerosNegativos++;
				}
			}
		}
		System.out.println("\nNúmeros Negativos = " + numerosNegativos);
		
		
		sc.close();
	}
}