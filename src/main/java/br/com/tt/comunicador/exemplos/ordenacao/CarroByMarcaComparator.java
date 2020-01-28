package br.com.tt.comunicador.exemplos.ordenacao;

import java.util.Comparator;

public class CarroByMarcaComparator
        implements Comparator<Carro> {

    @Override
    public int compare(Carro o1, Carro o2) {
        if(o1 == null || o2 == null){
            return 0;
        }
        int marca = o1.getMarca().compareTo(o2.getMarca());
        if(marca == 0){
            return Integer.compare(o1.getId(), o2.getId());
        }
        return marca;
    }
}
