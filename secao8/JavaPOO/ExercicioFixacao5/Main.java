package secao8.JavaPOO.ExercicioFixacao5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quarto[] quartos = new Quarto[10];
        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #"+(i+1));
            sc = new Scanner(System.in);
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int numero = sc.nextInt();
            quartos[numero] = new Quarto(nome, email, numero);
            System.out.println();
        }

        System.out.print("Busy rooms:");
        System.out.println();
        for (int i = 0; i < quartos.length;i++) {
            if(quartos[i] != null){
                System.out.println(
                quartos[i].getNumero()+": "+quartos[i].getNome() +
                ", " + quartos[i].getEmail());
            }
        }

        sc.close();
    }
}
