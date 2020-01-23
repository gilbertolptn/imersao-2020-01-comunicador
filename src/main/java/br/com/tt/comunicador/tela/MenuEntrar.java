package br.com.tt.comunicador.tela;

import br.com.tt.comunicador.common.Util;
import br.com.tt.comunicador.model.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class MenuEntrar {

    private final static DateTimeFormatter FORMATO
            = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Util util;

    MenuEntrar(Util util){
        this.util = util;
    }

    Usuario entrar(){
        util.print("Informe seu username:");
        String username = util.read();

        if(username.equals("admin")){
            throw new IllegalArgumentException("Admin não habilitado");
        }

        util.print("Informe seu nome:");
        String nome = util.read();

        util.print("Informe seu nascimento (dd/mm/yyyy)");
        String nascimentoTexto = util.read();

        LocalDate nascimento =
                LocalDate.parse(nascimentoTexto, FORMATO);

        return new Usuario(username, nome, nascimento);
    }
}
