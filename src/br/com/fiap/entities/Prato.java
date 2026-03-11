package br.com.fiap.entities;

public class Prato {

    private String nome;
    private double preco;
    private String descricao;

    // Construtor vazio (necessário para usar setters no Main)
    public Prato() {
    }

    // Construtor com parâmetros
    public Prato(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Prato\nNome: " + nome +
                "\nPreco: " + preco +
                "\nDescricao: " + descricao;
    }
}