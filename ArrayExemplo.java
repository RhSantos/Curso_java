import java.util.Scanner;

public class ArrayExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] alturas = new double[n];
        double alturasSoma = 0.0;

        for(int i=0;i<alturas.length;i++){
            double altura = sc.nextDouble();
            alturas[i] = altura;
            alturasSoma += altura;
        }

        double media = alturasSoma/n;

        System.out.printf("AVERAGE HEIGHT = %.2f", media);
    }
}
