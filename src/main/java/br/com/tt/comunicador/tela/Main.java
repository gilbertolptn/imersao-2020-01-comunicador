package br.com.tt.comunicador.tela;

import br.com.tt.comunicador.common.Util;
import br.com.tt.comunicador.exceptions.TamanhoMensagemInvalidoException;
import br.com.tt.comunicador.model.Mensagem;
import br.com.tt.comunicador.model.Usuario;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Usuario usuarioLogado;
    private static List<Mensagem> mensagens;

    private final static DateTimeFormatter FORMATO
            = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        mensagens = new ArrayList<>();
        entrar();
        do {
            novaMensagem();

            Util.print("Deseja sair? (S/N)");
            String resposta = Util.read();
            if("S".equals(resposta)){
                break;
            }
        }while (true);
        listarMensagens();
    }

    private static void entrar(){
        Util.print("Informe seu username:");
        String username = Util.read();

        Util.print("Informe seu nome:");
        String nome = Util.read();

        Util.print("Informe seu nascimento (dd/mm/yyyy)");
        String nascimentoTexto = Util.read();

        LocalDate nascimento =
                LocalDate.parse(nascimentoTexto, FORMATO);

        usuarioLogado = new Usuario(username, nome, nascimento);
    }

    private static void novaMensagem(){
        Util.print("Mensagem: ");
        String texto = Util.read();
        try {
            Mensagem mensagem = new Mensagem(texto);
            mensagens.add(mensagem);

        }catch (TamanhoMensagemInvalidoException e){
            System.err.println(e);
            Util.print(e.getMessage());
        } finally {
            //algo que sempre deve executar...
        }
        //dataHora.format(
        // DateTimeFormatter.ofPattern("dd/MM/yyy"));
    }

    private static void listarMensagens(){

        String descricoes = new String();
        for(int c=0; c < mensagens.size() ;c++){
            Mensagem msg = mensagens.get(c);
            descricoes += msg.getDescricao() + "\n";
            // outro exemplo: descricoes = descricoes.concat(msg + "\n");
        }
        Util.print(descricoes);

    }
}
