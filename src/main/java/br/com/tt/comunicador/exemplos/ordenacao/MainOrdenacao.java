package br.com.tt.comunicador.exemplos.ordenacao;

import java.io.File;
import java.util.*;

public class MainOrdenacao {
    public static void main(String[] args) {
        Set<Carro> carros = new TreeSet<>(new CarroByMarcaComparator());

        carros.add(new Carro(2, "Fusca", "VW"));
        carros.add(new Carro(1, "Variante", "VW"));
        carros.add(new Carro(4, "Monza", "GM"));
        carros.add(new Carro(3, "Belina", "Ford"));
        carros.add(new Carro(5, "147", "Fiat"));

//        carros.sort(Collections.reverseOrder());
        if(true){
//            Collections.sort(carros, new CarroByMarcaComparator());
        }else {
//            Collections.sort(carros, new CarroByNameComparator());
        }

        for (Carro c: carros) {
            System.out.println(c.toString());
        }
    }
}
