package br.com.tt.comunicador.exceptions;

public class TamanhoMensagemInvalidoException
//            extends RuntimeException{ //UNCHECKED - nao obriga try/catch ou throws
            extends Exception{ //CHECKED - Obriga tratamento ou throws

    public TamanhoMensagemInvalidoException(String msg){
        super(msg);
   }

}
