package JavaPOO.ExercicioFixacao4;

import java.util.Scanner;

import javax.script.ScriptEngineManager;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Nome da Conta: ");
        String nome = sc.nextLine();
        System.out.println();
        System.out.println("Digite o Número da Conta: ");
        int numero = sc.nextInt();
        System.out.println();
        System.out.println("Digite um valor para o Depósito "+
        "Inicial - OPCIONAL - Digite zero para nenhum: ");
        double depositoInicial = sc.nextDouble();

        if(depositoInicial == 0.0){
            Conta conta = new Conta(numero,nome);  
            continuacao(conta);
        }
        else{
            Conta conta = new Conta(numero,nome,depositoInicial);
            continuacao(conta);
        }
    } 

    public static void continuacao(Conta conta){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println(conta);
        System.out.println();
        System.out.println("Digite quanto deseja Depositar: ");
        double deposito = sc.nextDouble();
        System.out.println();
        conta.realizarDeposito(deposito);
        System.out.println(conta);
        System.out.println();
        System.out.println("Digite quanto deseja Sacar: ");
        double saque = sc.nextDouble();
        System.out.println();
        conta.realizarSaque(saque);
        System.out.println(conta);
    }
}
