package Practicum_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class Practicum11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regel;
        BufferedReader br ;
        BufferedWriter writer ;
        double p ;


        try {
            String inputFile;
            System.out.println("Voer de naam van het bronbestand in: ");
            inputFile = scanner.nextLine();
            Path path = Path.of(inputFile);
            br = Files.newBufferedReader(path);
            String outputFile;
            System.out.println("Voer het bestemmingsbestands in: ");
            outputFile = scanner.nextLine();
            Path pad = Path.of(outputFile);
            writer = Files.newBufferedWriter(pad);
            try {
                System.out.println("Voer het koersbedrag in: ");
                p = scanner.nextDouble();
                do {
                    regel = br.readLine();
                    if (regel == null){
                        break;
                    }
                    String[] euro = regel.split(":");
                    double e = Float.parseFloat(euro[1]) * p;
                    writer.append(euro[0] + ": "+ e);
                    writer.newLine();
                }
                while (true);
                writer.close();
                br.close();
            }catch (Exception e){
                System.out.println("Het ingevoerde koersbedrag is met komma en geen punt!");
            }
        }catch (IOException e){
            System.out.println("Het bronbestand is verkeerd!");
        }




    }
}


