package br.com.tt.comunicador.tela;

import br.com.tt.comunicador.common.Util;
import br.com.tt.comunicador.exceptions.TamanhoMensagemInvalidoException;
import br.com.tt.comunicador.model.Mensagem;
import br.com.tt.comunicador.model.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Usuario usuarioLogado;
    private static List<Mensagem> mensagens;

    private static Util util = new Util();
    private static MenuEntrar menuEntrar = new MenuEntrar(util);

    public static void main(String[] args) {
        mensagens = new ArrayList<>();
        usuarioLogado = menuEntrar.entrar();
        do {
            novaMensagem();

            util.print("Deseja sair? (S/N)");
            String resposta = util.read();
            if("S".equals(resposta)){
                break;
            }
        }while (true);
        listarMensagens();
    }

    private static void novaMensagem(){
        util.print("Mensagem: ");
        String texto = util.read();
        try {
            Mensagem mensagem = new Mensagem(texto);
            mensagens.add(mensagem);

        }catch (TamanhoMensagemInvalidoException e){
            System.err.println(e);
            util.print(e.getMessage());
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
        util.print(descricoes);

    }
}
