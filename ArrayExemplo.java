import java.util.Scanner;

public class ArrayExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] alturas = new double[n];

        for(int i=0;i<alturas.length;i++){
            alturas[i] = sc.nextDouble();
        }

        double media = (alturas[0] + alturas[1] + alturas[2])/n;

        System.out.printf("AVERAGE HEIGHT = %.2f", media);
    }
}
