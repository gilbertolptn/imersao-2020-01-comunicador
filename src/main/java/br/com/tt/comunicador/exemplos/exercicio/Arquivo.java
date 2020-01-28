package br.com.tt.comunicador.exemplos.exercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Arquivo {

    public static void main(String[] args) throws FileNotFoundException {
        List<String> pessoas = leArquivo();
        List<String> nomesOrdenados = retornaNomesOrdenados(pessoas);
        listaNomesSemRepeticoes(nomesOrdenados);
        criaHashMap(pessoas);
        criaListaPessoa(pessoas);
        Map<Integer, Pessoa> lista = criaHashMapPessoa(pessoas);
    }

    private static Map<Integer, String> criaHashMap(List<String> pessoas) {

        Map<Integer, String> hashPessoas = new TreeMap<>();

        for(String pessoa : pessoas){
            String[] partes = pessoa.split(",");
            Integer id = Integer.parseInt(partes[0]);
            String nome = partes[1];
            hashPessoas.put(id, nome);
        }

        return hashPessoas;
    }

    private static Map<Integer, Pessoa> criaHashMapPessoa(List<String> pessoas) {

        Map<Integer, Pessoa> hashPessoas = new TreeMap<>();

        for(String pessoa : pessoas){
            String[] partes = pessoa.split(",");
            Integer id = Integer.parseInt(partes[0]);
            String nome = partes[1];
            hashPessoas.put(id, new Pessoa(id, nome));
        }

        return hashPessoas;
    }
    private static Set<Pessoa> criaListaPessoa(List<String> pessoas) {

        Set<Pessoa> setPessoas = new TreeSet<>();

        for(String pessoa : pessoas){
            String[] partes = pessoa.split(",");
            Integer id = Integer.parseInt(partes[0]);
            String nome = partes[1];
            setPessoas.add(new Pessoa(id, nome));
        }

        return setPessoas;
    }
    private static void listaNomesSemRepeticoes(List<String> nomes) {

        Set<String> listaUnicos = new TreeSet<>(nomes);
        for(String nome: listaUnicos){
            System.out.println(nome);
        }
    }

    private static List<String> retornaNomesOrdenados(List<String> pessoas) {
        List<String> nomesPessoas = new ArrayList<>();
        for(String pessoa : pessoas){
            String[] split = pessoa.split(",");
            String nome = split[1];
            nomesPessoas.add(nome);
        }

        Collections.sort(nomesPessoas);

        return nomesPessoas;
    }

    private static List<String> leArquivo() throws FileNotFoundException {
        Scanner scanner = new Scanner(
                new File("input_1.txt"));

        System.out.println("Ignorando cabeçalho: "+scanner.nextLine());

        List<String> pessoas = new ArrayList<>();
        while (scanner.hasNextLine()){
            pessoas.add(scanner.nextLine());
        }
        return pessoas;
    }


    public void getFile() throws IOException {
        Path resource = Paths.get("classpath:input_1.txt");
        Scanner scanner = new Scanner(resource);
        System.out.println(scanner.nextLine());
    }
}
