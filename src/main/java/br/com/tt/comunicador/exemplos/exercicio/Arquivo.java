package br.com.tt.comunicador.exemplos.exercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Arquivo {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(
                new File("\\input_1.txt"));

        while (scanner.hasNextLine()){
            List<String> partes = Arrays.asList(scanner
                    .nextLine()
                    .split(","));
            System.out.println(partes.get(0));
        }

    }







    public void getFile() throws IOException {
        Path resource = Paths.get("classpath:input_1.txt");
        Scanner scanner = new Scanner(resource);
        System.out.println(scanner.nextLine());
    }
}
