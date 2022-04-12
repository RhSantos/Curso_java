package secao14.ExercicioFixacaoPolimorfismo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import secao14.ExercicioFixacaoPolimorfismo.entities.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        List<Product> products = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            Character type = sc.next().charAt(0);
            sc = new Scanner(System.in);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (type == 'u') {
                System.out.print("Manufacture date: (DD/MM/YYYY): ");
                String manufactureDate = sc.next();
                products.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));
            } else if (type == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            } else {
                products.add(new Product(name, price));
            }
        }
        sc.close();
        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.print(product.priceTag() + "\n");
        }
    }
}
