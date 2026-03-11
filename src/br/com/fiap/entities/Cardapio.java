package br.com.fiap.entities;

public class Cardapio {
    private Prato prato;

    public void  adicionarPrato(Prato prato) {
        this.prato = prato;
        System.out.println("Prato adicionado ao cardápio: " + prato.getNome());
    }

    public void removerPrato() {
        System.out.println("Prato removido do cardápio");
        prato = null;
    }

    public Prato getPrato() {
        return prato;
    }
}
