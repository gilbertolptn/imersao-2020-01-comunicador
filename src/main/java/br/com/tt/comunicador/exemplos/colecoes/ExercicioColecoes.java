package br.com.tt.comunicador.exemplos.colecoes;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExercicioColecoes {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        LinkedHashSet<Integer> lista = new LinkedHashSet<>();
        for (int count = 0; count <= 300_000;count++) {
            lista.add(Double.valueOf(Math.random()*10000).intValue());
        }

        long tempo = System.currentTimeMillis() - inicio;
        System.out.println("Tempo add: "+ tempo);

        inicio = System.currentTimeMillis();
        Iterator<Integer> it = lista.iterator();

        BigInteger soma = BigInteger.ZERO;
        while (it.hasNext()){
//            System.out.print(it.next());
            soma = soma.add(BigInteger.valueOf(it.next()));
        }
        tempo = System.currentTimeMillis() - inicio;
        System.out.println("Tempo soma: "+ tempo);
        System.out.println("Soma: "+ soma);
    }
}
