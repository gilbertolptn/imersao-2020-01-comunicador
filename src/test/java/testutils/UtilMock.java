package testutils;

import br.com.tt.comunicador.common.Util;

/**
 * Isso seria necessário sem o Mockito :(
 */
@Deprecated
public class UtilMock extends Util {

    int contador = 0;

    @Override
    public String read() {
        contador++;
        if(contador == 1){
            return "lptn";
        }
        if(contador == 2){
            return "Gilberto";
        }
        if(contador == 3){
            return "01/10/1999";
        }
        return "";
    }

    @Override
    public void print(String texto) {
        System.out.println(texto);
    }

    public int getContador() {
        return contador;
    }
}
