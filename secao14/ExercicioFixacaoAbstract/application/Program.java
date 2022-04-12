package secao14.ExercicioFixacaoAbstract.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao14.ExercicioFixacaoAbstract.entities.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        List<Person> persons = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or Company (i/c)? ");
            Character type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if(type == 'i'){
                System.out.print("Health expeditures: ");
                Double healthExpeditures = sc.nextDouble();
                persons.add(new PersonalPerson(name, anualIncome, healthExpeditures));
            }
            else{
                System.out.print("Number of employees: ");
                Integer employeesNumber = sc.nextInt();
                persons.add(new LegalPerson(name, anualIncome, employeesNumber));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        Double totalTaxes = 0.0;
        for (Person person : persons) {
            System.out.println(person.getName()+": $ "+String.format("%.2f",person.totalTax()));
            totalTaxes += person.totalTax();
        }
        System.out.println();
        System.out.print("TOTAL TAXES: $ "+String.format("%.2f",totalTaxes));
        sc.close();
    }
}
