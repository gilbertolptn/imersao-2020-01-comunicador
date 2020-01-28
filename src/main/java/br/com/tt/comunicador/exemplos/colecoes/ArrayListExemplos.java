package br.com.tt.comunicador.exemplos.colecoes;

import java.util.*;

public class ArrayListExemplos {

    public static void main(String[] args) {

        ArrayList<String> colecao = new ArrayList<>();
//        colecao.add(null);
        colecao.add("Java");
        colecao.add("PHP");
        colecao.add("C#");
        colecao.add("JS");
        colecao.add("JS");
        colecao.add("JS");
        colecao.add("Python");

        Collections.sort(colecao);

        System.out.println(colecao.indexOf("Python"));

        for (String linguagem : colecao) {
            System.out.println(linguagem);
        }

        Iterator it = colecao.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
