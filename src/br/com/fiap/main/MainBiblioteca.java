package br.com.fiap.main;

import br.com.fiap.entities.Biblioteca;
import br.com.fiap.entities.Emprestimo;
import br.com.fiap.entities.Livro;
import br.com.fiap.entities.Membro;

import javax.swing.*;

public class MainBiblioteca {

    // Métodos Static
    static String text(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        // Instanciar objetos
        Livro objLivro = new Livro();
        Membro objMembro = new Membro();
        Emprestimo objEmprestimo = new Emprestimo();
        Biblioteca objBiblioteca = new Biblioteca();

        // Cadastro Livro
        objLivro.setTitulo(text("Cadastro do Livro\nTitulo"));
        objLivro.setAutor(text("Autor do livro"));
        objLivro.setIsbn(text("ISBN do livro"));

        // Cadastro Membro
        objMembro.setNome(text("Cadastro do Membro\nNome"));
        objMembro.setId(inteiro("ID do membro"));
        objMembro.setEmail(text("Email do membro"));

        // Cadastro Empréstimo
        objEmprestimo.setLivro(objLivro);
        objEmprestimo.setMembro(objMembro);
        objEmprestimo.setDataEmprestimo(text("Data do empréstimo"));

        // Operações
        objBiblioteca.adicionarLivro(objLivro);
        objBiblioteca.registrarMembro(objMembro);
        objBiblioteca.registrarEmprestimo(objEmprestimo);
        objBiblioteca.devolverLivro(objLivro);

        // Saída
        System.out.println(objLivro);
        System.out.println(objMembro);
        System.out.println(objEmprestimo);
    }
}