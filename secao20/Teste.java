package secao20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        
        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 350.50));
        list.add(new Product("Tablet", 755.99));
        list.add(new Product("HD Case", 156.75));

        list.removeIf(e -> e.getPrice() < 500.00);
        list.forEach(e -> System.out.println(e.getNome()+", "+e.getPrice()));
        
    }
}
