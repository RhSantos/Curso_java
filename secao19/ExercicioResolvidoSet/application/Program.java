package secao19.ExercicioResolvidoSet.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import secao19.ExercicioResolvidoSet.entities.User;

public class Program {
    public static void main(String[] args) throws ParseException {
        Set<User> set = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("secao19/ExercicioResolvidoSet/in.txt"))){
            String line;
            
            while((line = br.readLine()) != null){
                line = line.trim();
                String[] fields = line.split(" ");
                Date date = Date.from(Instant.parse(fields[1]));
                set.add(new User(fields[0], date));
            }
            System.out.println("Total Users: " +set.size());
        } catch (FileNotFoundException e) {
            System.out.println("File not found"); 
        } catch (IOException e) {
            System.out.println("Error reading the file");
        }
    }
}
