package edu.clezer.gerenciadorpedidos.model.item;

public class Item {
    private int idItem;
    private String descricao;
    private double valor;
    private double peso;

    public Item(int idItem, String descricao, double valor, double peso){
        this.idItem = idItem;
        this.descricao = descricao;
        this.valor = valor;
        this.peso = peso;
    }

    public int getIdItem() {
        return idItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
}
