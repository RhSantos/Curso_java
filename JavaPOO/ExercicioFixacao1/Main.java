package JavaPOO.ExercicioFixacao1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        
        r1.setWidth(sc.nextDouble());
        r1.setHeight(sc.nextDouble());
        
        System.out.println("AREA = "+r1.Area());
        System.out.println("PERIMETRO = "+r1.Perimeter());
        System.out.println("DIAGONAL = "+r1.Diagonal());

    }

}
