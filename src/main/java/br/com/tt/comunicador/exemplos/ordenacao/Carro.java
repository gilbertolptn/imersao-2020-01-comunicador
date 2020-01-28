package br.com.tt.comunicador.exemplos.ordenacao;

public class Carro implements Comparable<Carro>{
    private int id;
    private String modelo;
    private String marca;

    public Carro(int id, String modelo, String marca) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int compareTo(Carro outro) {
        if(this.id < outro.id){
            return -1;
        }
        if(this.id > outro.id){
            return 1;
        }
        return 0;
    }
}
