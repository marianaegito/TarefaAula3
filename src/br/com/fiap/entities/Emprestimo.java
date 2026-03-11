package br.com.fiap.entities;

public class Emprestimo {

    private Livro livro;
    private Membro membro;
    private String dataEmprestimo;

    public Emprestimo() {
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Emprestimo\nLivro: " + livro.getTitulo() +
                "\nMembro: " + membro.getNome() +
                "\nData: " + dataEmprestimo;
    }
}