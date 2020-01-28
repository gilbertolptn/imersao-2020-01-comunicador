package br.com.tt.comunicador.exemplos.exercicio;

public class Pessoa implements Comparable<Pessoa>{

    private Integer id;
    private String nome;

    public Pessoa(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public int compareTo(Pessoa o) {
        return getNome().compareTo(o.getNome());
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
