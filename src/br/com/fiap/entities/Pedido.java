package br.com.fiap.entities;

public class Pedido {

    private int numeroPedido;
    private String cliente;
    private Prato listaDePratos;
    private double total;

    public Pedido() {
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Prato getListaDePratos() {
        return listaDePratos;
    }

    public void setListaDePratos(Prato listaDePratos) {
        this.listaDePratos = listaDePratos;
    }

    public double getTotal() {
        return total;
    }

    public void calcularTotal(){
        if(listaDePratos != null){
            total = listaDePratos.getPreco();
        }
    }

    @Override
    public String toString() {
        return "Pedido\nNumero: " + numeroPedido +
                "\nCliente: " + cliente +
                "\nPrato: " + listaDePratos.getNome() +
                "\nTotal: " + total;
    }
}