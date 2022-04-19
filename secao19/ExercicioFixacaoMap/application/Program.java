package secao19.ExercicioFixacaoMap.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<String,Integer> eleicao = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("secao19/ExercicioFixacaoMap/votos.csv"))){
            String line;
            while((line = br.readLine()) != null){
                line = line.trim();
                String[] fields = line.split(",");
                String nome = fields[0];
                Integer votos = Integer.parseInt(fields[1]);
                eleicao.put(nome, votos);
            }
            System.out.println("\n--ELEIÇÃO 2022--\n");
            for (String key : eleicao.keySet()) {
                System.out.print("\nNome do Candidato: "+key+"\nVotos: "+eleicao.get(key)+"\n\n");
            }
            System.out.println("----------------\n");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch(IOException e){
            System.out.println("Cannot read the File");
        }
    }
}
