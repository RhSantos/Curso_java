package secao19.ExercicioFixacaoSet.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> alunos_cursos = new HashSet<>();
        System.out.print("How many students for course A?");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            alunos_cursos.add(sc.nextInt());
        }
        System.out.print("How many students for course B?");
        n = sc.nextInt();
        for(int i = 0;i<n;i++){
            alunos_cursos.add(sc.nextInt());
        }
        System.out.print("How many students for course C?");
        n = sc.nextInt();
        for(int i = 0;i<n;i++){
            alunos_cursos.add(sc.nextInt());
        }
        System.out.print("\nTotal Students: "+alunos_cursos.size());
        sc.close();
    }
}
