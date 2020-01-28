package br.com.tt.comunicador.exemplos.ordenacao;

import java.util.Comparator;

public class CarroByNameComparator
        implements Comparator<Carro> {

    @Override
    public int compare(Carro o1, Carro o2) {
        if(o1 == null || o2 == null){
            return 0;
        }
        return o1.getModelo().compareTo(o2.getModelo());
    }
}
