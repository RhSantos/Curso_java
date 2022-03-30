package JavaPOO.ExercicioFixacao1;

import java.lang.Math;

public class Rectangle {
    private double width;
    private double height;

    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double Area(){
        double area = width * height;
        return area;
    }

    public double Perimeter(){
        double perimeter = (2* width) + (2 *height);
        return perimeter;
    }

    public double Diagonal(){
        double diagonal = Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
        return diagonal;
    }
}
