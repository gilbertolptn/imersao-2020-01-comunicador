package br.com.tt.comunicador.model;

import java.time.LocalDateTime;

public class Mensagem {
    private String texto;
//    private ZonedDateTime dataHora;
    private LocalDateTime dataHora;

    public Mensagem(String texto) {
        this.texto = texto;
        this.dataHora = LocalDateTime.now();
    }
}
