package edu.clezer.gerenciadorpedidos.view;

import edu.clezer.gerenciadorpedidos.controller.*;
import java.util.Scanner;

public class Interface {

    Scanner input = new Scanner(System.in);

    public int menu(){
        System.out.println();
        System.out.println("Gerenciador de Pedidos");
        System.out.println("Selecione a opção desejada");
        System.out.println();
        System.out.println("1 - Pedios");
        System.out.println("2 - Clientes");
        System.out.println("3 - Itens");
        System.out.println("4 - Sair...");

        int opcao = input.nextInt();
        return opcao;
    }
    
    public int opcoesPedidos(){
        System.out.println();
        System.out.println("Selecione a opção desejada");
        System.out.println();
        System.out.println("1 - Visualizar pedios");
        System.out.println("2 - Cadastrar pedios");
        System.out.println("3 - Atualizar pedido");
        System.out.println("4 - Deletar pedido");
        System.out.println("5 - Voltar...");

        int opcao = input.nextInt();
        return opcao;

    }

    public int opcoesClientes(){
        System.out.println();
        System.out.println("Selecione a opção desejada");
        System.out.println();
        System.out.println("1 - Visualizar clientes");
        System.out.println("2 - Cadastrar clientes");
        System.out.println("3 - Atualizar cliente");
        System.out.println("4 - Deletar clientes");
        System.out.println("5 - Voltar...");

        int opcao = input.nextInt();
        return opcao;

    }

    public int opcoesItens(){
        System.out.println();
        System.out.println("Selecione a opção desejada");
        System.out.println();
        System.out.println("1 - Visualizar item");
        System.out.println("2 - Cadastrar item");
        System.out.println("3 - Atualizar item");
        System.out.println("4 - Deletar item");
        System.out.println("5 - Voltar...");

        int opcao = input.nextInt();
        return opcao;

    }

}
