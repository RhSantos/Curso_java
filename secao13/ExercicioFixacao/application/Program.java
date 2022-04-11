package secao13.ExercicioFixacao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import secao13.ExercicioFixacao.entities.*;
import secao13.ExercicioFixacao.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();
        Client client = new Client(name, email,sdf.parse(birthDate));
        Order order = new Order(client);
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();
        order.setStatus(OrderStatus.valueOf(status));
        System.out.println("How many items to this order? ");
        Integer ordersNum = sc.nextInt();
        for (int i = 1; i <= ordersNum; i++) {
            System.out.println("Enter #"+i+" item data:");
            System.out.print("Product name: ");
            sc = new Scanner(System.in);
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            Double pPrice = sc.nextDouble();
            Product product = new Product(pName, pPrice);
            System.out.print("Quantity: ");
            Integer pQuantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(pQuantity, product);
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println(order);
    }
}
