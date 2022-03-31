package ArrayExemplo2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        Produto[] produtos = new Produto[n];

        for(int i=0;i<n;i++){
            sc = new Scanner(System.in);
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            produtos[i] = new Produto(nome, preco);
        }

        for(Produto produto: produtos){
            System.out.println(produto);
        }
        sc.close();
    }
}
