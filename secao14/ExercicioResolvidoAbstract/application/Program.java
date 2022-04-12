package secao14.ExercicioResolvidoAbstract.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao14.ExercicioResolvidoAbstract.entities.Circle;
import secao14.ExercicioResolvidoAbstract.entities.Rectangle;
import secao14.ExercicioResolvidoAbstract.entities.Shape;
import secao14.ExercicioResolvidoAbstract.enums.Color;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        List<Shape> shapes = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #"+i+" data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            Character type = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if(type == 'r'){
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                shapes.add(new Rectangle(color, width, height));
            }
            else{
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            }
        }
        System.out.println("SHAPES AREAS:");
        for (Shape shape : shapes) {
            System.out.println(String.format("%.2f", shape.area()));
        }
        sc.close();
    }
}
