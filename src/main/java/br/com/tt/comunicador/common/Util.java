package br.com.tt.comunicador.common;

import javax.swing.*;

public class Util {

    public void print(String texto){
        JOptionPane
        .showMessageDialog(null, texto);
        //System.out.println(texto);
    }

    public String read(){
        return JOptionPane.showInputDialog("");
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
    }
}
