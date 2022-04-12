package secao15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1+Math.random()*13);
        }
        int n = -1;
        while(n < 0 || n > 9){
            try{
                System.out.println("Digite uma posiçao de 0 - 9 para mostrar!");

                n = sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Voce deve digitar um numero inteiro!");
                sc.next();
                continue;
            }
            if(n < 0 || n > 9) System.out.println("Voce deve digitar uma posicao valida!");
        }


        System.out.println(array[n]);

        sc.close();
   } 
}
