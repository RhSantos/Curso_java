package JavaPOO.ExercicioFixacao2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.setName(sc.nextLine());
        System.out.print("Gross Salary: ");
        emp.setGrossSalary(sc.nextDouble());
        System.out.print("Tax: ");
        emp.setTax(sc.nextDouble());
        System.out.println();
        System.out.println("Employee: "+emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        

        System.out.println("Update data: "+emp);
        sc.close();
        
    }
}
