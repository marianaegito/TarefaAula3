package br.com.fiap.entities;

public class Biblioteca {

    public void adicionarLivro(Livro livro){
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void registrarMembro(Membro membro){
        System.out.println("Membro registrado: " + membro.getNome());
    }

    public void registrarEmprestimo(Emprestimo emprestimo){
        System.out.println("Empréstimo registrado.");
    }

    public void devolverLivro(Livro livro){
        System.out.println("Livro devolvido: " + livro.getTitulo());
    }
}