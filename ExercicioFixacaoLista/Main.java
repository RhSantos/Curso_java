package ExercicioFixacaoLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Funcionario> funcionarios = new ArrayList<>();
        System.out.print("Quantos Funcionários você deseja registrar? ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionário #"+(i));
            Integer id = 0;
            do{
                System.out.print("ID: ");
                id = sc.nextInt();
                if(temId(funcionarios, id) != null) System.out.println("\nID já registrado! Tente Novamente!\n");
                if(id == 0) System.out.println("\nID não pode ser 0!\n");
            }while(temId(funcionarios, id) != null || id == 0);
            System.out.println();
            System.out.print("Nome: ");
            sc = new Scanner(System.in);
            String nome = sc.nextLine();
            System.out.println();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            System.out.println();
            Funcionario funcionario = new Funcionario(id, nome, salario);
            funcionarios.add(funcionario);
        }
    
        System.out.println("Funcionários:");

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        System.out.println("\nDigite o ID do Funcionário que você deseja aumentar o salário!\n");
        int idSalario = sc.nextInt();
        Integer posicao = temId(funcionarios,idSalario);
        if(temId(funcionarios,idSalario) != null){
            System.out.println("\nDigite a porcentagem que quer aumentar?\n");
            double aumento = sc.nextDouble();
            funcionarios.get(posicao).aumentoSalario(aumento);
            System.out.println("Lista de Funcionários Atualizada!\n");
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
        else{
            System.out.println("\nID não Encontrado!\n");
        }
        sc.close();
    }

    public static Integer temId(List<Funcionario> func,Integer id){
        for (int i = 0;i < func.size(); i++) {
            if(func.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
