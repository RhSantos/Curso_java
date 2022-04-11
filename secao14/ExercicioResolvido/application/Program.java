package secao14.ExercicioResolvido.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao14.ExercicioResolvido.entities.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #"+i+" data:");
            Character outsourced = '\u0000';
            do{
                System.out.print("Outsourced (y/n)? ");
                outsourced = sc.next().charAt(0);
                sc = new Scanner(System.in);
                if(outsourced !='y' && outsourced !='n'){
                    System.out.print("ERRO - Digite y/n\n");
                }
            }while(outsourced !='y' && outsourced !='n');
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            
            if(outsourced == 'y'){
                System.out.print("Additional Charge: ");
                Double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));
            }
            else{
                employees.add(new Employee(name,hours,valuePerHour));
            }
        }
        System.out.println("\nPAYMENTS:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName()+" - $ "+String.format("%.2f",employees.get(i).payment()));
        }
        sc.close();
    }
}
