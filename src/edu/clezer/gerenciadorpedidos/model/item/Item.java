package edu.clezer.gerenciadorpedidos.model.item;

public class Item {
    private int idItem;
    private String descricao;
    private int quantidade;
    private double valor;

    public Item(int idItem, String descricao, int quantidade, double valor){
        this.idItem = idItem;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }
}
