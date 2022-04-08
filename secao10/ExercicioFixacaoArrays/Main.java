package secao10.ExercicioFixacaoArrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        Produto[] produtos = new Produto[n];

        double precoProdutos = 0.0;

        for(int i=0;i<n;i++){
            sc = new Scanner(System.in);
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            produtos[i] = new Produto(nome, preco);
            precoProdutos += preco;
        }
        System.out.println();
        for(Produto produto: produtos){
            System.out.println(produto);
        }

        double mediaProdutos = precoProdutos / n;

        System.out.printf("AVERAGE PRICE = %.2f%n",mediaProdutos);

        sc.close();
    }
}
