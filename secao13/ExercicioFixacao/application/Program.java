package secao13.ExercicioFixacao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import secao13.ExercicioFixacao.entities.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Product p1 = new Product("iMac",7890.99);
        Product p2 = new Product("Samsung A50", 1329.99);

        Client c1 = new Client("Rhuan Santos", "rhuan.santos@gmail.com", 
        sdf.parse("01/10/2001"));
        
        OrderItem oI1 = new OrderItem(1, p1);
        OrderItem oI2 = new OrderItem(3, p2);

        Order o = new Order(c1);

        o.addItem(oI1);
        o.addItem(oI2);

        System.out.println();
    }
}
