package br.com.tt.comunicador.model;

import br.com.tt.comunicador.exceptions.TamanhoMensagemInvalidoException;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem {
    private static final int TAMANHO_MINIMO_MENSAGEM = 5;

    private String texto;
//    private ZonedDateTime dataHora;
    private LocalDateTime dataHora;

    public Mensagem(String texto)
            throws TamanhoMensagemInvalidoException {
        verificaTamanhoMinimo(texto);
        this.texto = texto;
        this.dataHora = LocalDateTime.now();
    }

    private void verificaTamanhoMinimo(String texto)
    throws TamanhoMensagemInvalidoException {
        if(texto == null || texto.length() < TAMANHO_MINIMO_MENSAGEM){
            throw new TamanhoMensagemInvalidoException(
        "Erro: Tamanho mínimo: "+TAMANHO_MINIMO_MENSAGEM);
        }
    }

    public String getDescricao() {
        //TODO trocar por StringBuilder
        String dataHoraFormatada = "(sem data)";
        if(dataHora != null){
            dataHoraFormatada =
                    dataHora.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        }
        return "Mensagem enviada em "
                + dataHoraFormatada +
//                + dataHora.format(DateTimeFormatter.ofPattern("hh:mm:ss")) +
                ": " + texto;
    }
}
