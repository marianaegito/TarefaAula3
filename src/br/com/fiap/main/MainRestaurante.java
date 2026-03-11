package br.com.fiap.main;

import br.com.fiap.entities.Pedido;
import br.com.fiap.entities.Prato;

import javax.swing.*;

public class MainRestaurante {

    static String text(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        while (true) {
            try {
                String valor = JOptionPane.showInputDialog(j);
                valor = valor.replace(",", ".");
                return Double.parseDouble(valor);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido!");
            }
        }
    }

    public static void main(String[] args) {

        // Instanciar objetos
        Pedido objPedido = new Pedido();
        Prato objPrato = new Prato();

        // Cadastro do prato
        objPrato.setNome(text("Cadastro do Prato\nNome"));
        objPrato.setPreco(real("Preço do prato"));
        objPrato.setDescricao(text("Descrição do prato"));

        // Cadastro do pedido
        objPedido.setNumeroPedido(inteiro("Número do pedido"));
        objPedido.setCliente(text("Nome do cliente"));
        objPedido.setListaDePratos(objPrato);
        objPedido.calcularTotal();

        // Visualização
        System.out.println(objPedido);
    }
}