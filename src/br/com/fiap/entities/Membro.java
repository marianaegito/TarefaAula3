package br.com.fiap.entities;

public class Membro {

    private String nome;
    private int id;
    private String email;

    // Construtor vazio
    public Membro() {
    }

    // Construtor com parâmetros
    public Membro(String nome, int id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Membro\nNome: " + nome +
                "\nID: " + id +
                "\nEmail: " + email;
    }
}