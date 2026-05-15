package model;

public class Despesa {
    public String descricao;
    public double valor;
    public String categoria;

    public Despesa(String descricao, double valor, String categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }
}