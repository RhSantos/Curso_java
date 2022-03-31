package JavaPOO.ExercicioFixacao1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Rectangle r1 = new Rectangle();
        
        r1.setWidth(width);
        r1.setHeight(height);
        
        System.out.println("AREA = "+r1.Area());
        System.out.println("PERIMETRO = "+r1.Perimeter());
        System.out.println("DIAGONAL = "+r1.Diagonal());

        sc.close();
    }

}
