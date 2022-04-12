package secao15.ExercicioFixacao.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import secao15.ExercicioFixacao.model.entities.*;
import secao15.ExercicioFixacao.model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.next();
            System.out.print("Initial balance: ");
            Double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            Account acc = new Account(number, holder, initialBalance,withdrawLimit);
            System.out.println();
            System.out.print("Enter the amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            acc.withdraw(withdraw);
            System.out.println("New balance: "+String.format("%.2f",acc.getBalance()));
            sc.close();
        }
        catch(InputMismatchException e){
            System.out.println("Wrong value type");
        }
        catch(DomainException e){
            System.out.println("Withdraw error: "+e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected error");
        }
    }    
}
