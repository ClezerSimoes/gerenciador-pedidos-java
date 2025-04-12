package edu.clezer.gerenciadorpedidos.controller;

import edu.clezer.gerenciadorpedidos.model.pedido.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Date;


public class DadosPedidos {
    private List<Pedido> pedidos = new ArrayList<>();
    private DadosItens dadosItens;
    private DadosUsuario dadosUsuario;
    Scanner input = new Scanner(System.in);

    public DadosPedidos(DadosItens dadosItens, DadosUsuario dadosUsuario){
        this.dadosItens = dadosItens;
        this.dadosUsuario = dadosUsuario;
    }

    public void cadastrarPedido(){
        System.out.println("Insira ID do pedido");
        int idPedido = input.nextInt();
        input.nextLine(); // Lê a linha vazia

        System.out.println("Insira ID do cliente");
        int idCliente = input.nextInt();
        input.nextLine(); // Lê a linha vazia
        String nomeCliente = dadosUsuario.getNome(idCliente);
        System.out.printf("O cliente é: %s ?%n%n", nomeCliente);

        System.out.println("Insira o codigo de referência do item");
        int codigoReferencia = input.nextInt();
        input.nextLine();

        System.out.println("Insira a quantidade");
        int quantidadeItem = input.nextInt();
        input.nextLine();

        System.out.println("Insira o prazo");
        String dataString = input.nextLine();
        Date prazo = Date.valueOf(dataString);

        System.out.println("Insira uma observação");
        String observacao = input.nextLine();

        Double valorUnitario = dadosItens.getValorUnitario(codigoReferencia);
        double valor = valorUnitario * quantidadeItem;

        Pedido pedido = new Pedido(idPedido, idCliente, codigoReferencia, prazo, valor);

        pedidos.add(pedido);

    }

    public void alterarPedido(){
        
        
    }

    public void deletarPedido(){

    }
}
