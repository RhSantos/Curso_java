package secao14.ExemploAula143.application;

import secao14.ExemploAula143.entities.*;

public class Program {
    public static void main(String[] args) {
        // Account acc = new Account(123, "Alex", 0.0);
        // BusinessAccount bacc = new BusinessAccount(32, "Maria", 21.00, 500.00);

        // //upcasting
        // Account acc1 = bacc;
        Account acc2 = new BusinessAccount(58, "Robson", 2211.00, 2500.00);
        // Account acc3 = new SavingsAccount(58, "Robson", 2211.00,0.6);

        // //downcasting
        BusinessAccount acc4 = (BusinessAccount) acc2;
         acc4.loan(120.00);
        // System.out.println(acc4.getBalance());
        
    }
}
