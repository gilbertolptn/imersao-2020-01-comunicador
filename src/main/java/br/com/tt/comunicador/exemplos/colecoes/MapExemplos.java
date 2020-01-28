package br.com.tt.comunicador.exemplos.colecoes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExemplos {

    public static void main(String[] args) {

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "RS");
        mapa.put(2, "SC");
        mapa.put(3, "PR");

        System.out.println(mapa.get(3));

        for(Map.Entry item : mapa.entrySet()){
            System.out.println(item.getKey()
                    +": "+
                    item.getValue());
        }
    }
}
