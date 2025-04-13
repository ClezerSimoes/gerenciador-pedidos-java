package edu.clezer.gerenciadorpedidos.view;

import edu.clezer.gerenciadorpedidos.controller.*;
import java.util.Scanner;

public class Interface {
    private DadosUsuario dadosUsuario;
    private DadosItens dadosItens;
    private DadosPedidos dadosPedidos;
    Scanner input = new Scanner(System.in);

    public Interface(DadosUsuario dadosUsuario, DadosItens dadosItens, DadosPedidos dadosPedidos){
        this.dadosUsuario = dadosUsuario;
        this.dadosItens = dadosItens;
        this. dadosPedidos = dadosPedidos;
    }    

    public int exibirMenu(){
        System.out.println();
        System.out.println("Gerenciador de Pedidos");
        System.out.println("Selecione a opção desejada");
        System.out.println();
        System.out.println("1 - Pedios");
        System.out.println("2 - Clientes");
        System.out.println("3 - Itens");
        System.out.println("4 - Sair...");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                opcao = exibirOpcoesPedidos();
                break;

            case 2:
                opcao = exibirOpcoesClientes();
                break;

            case 3:
                opcao = exibirOpcoesItens();
                break;

            case 4:
                System.out.println("Obrigado por utilizar o Gerenciador de Pedidos");
                System.out.println("Saindo...");
                break;
        
            default:
                break;
        }
        return opcao;
    }
    
    public int exibirOpcoesPedidos(){
        System.out.println();
        System.out.println("Selecione a opção desejada");
        System.out.println();
        System.out.println("1 - Visualizar pedios");
        System.out.println("2 - Cadastrar pedios");
        System.out.println("3 - Atualizar pedido");
        System.out.println("4 - Deletar pedido");
        System.out.println("5 - Voltar...");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Pedido tal tal tal");
                break;
            case 2:
                this.dadosPedidos.cadastrarPedido();
                break;
            case 3:
                this.dadosPedidos.alterarPedido();
                break;
            case 4:
                this.dadosPedidos.deletarPedido();
                break;
            case 5:
                exibirMenu();
                break;
        
            default:
                break;
        }

        return opcao;

    }

    public int exibirOpcoesClientes(){
        System.out.println();
        System.out.println("Selecione a opção desejada");
        System.out.println();
        System.out.println("1 - Visualizar clientes");
        System.out.println("2 - Cadastrar clientes");
        System.out.println("3 - Atualizar cliente");
        System.out.println("4 - Deletar clientes");
        System.out.println("5 - Voltar...");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Fulano de tal");
                break;
            case 2:
                this.dadosUsuario.cadastrarUsuario();
                break;
            case 3:
                this.dadosUsuario.atualizarUsuario();
                break;
            case 4:
                this.dadosUsuario.deletarUsuario();
                break;
            case 5:
                exibirMenu();
                break;
        
            default:
                break;
        }

        return opcao;

    }

    public int exibirOpcoesItens(){
        System.out.println();
        System.out.println("Selecione a opção desejada");
        System.out.println();
        System.out.println("1 - Visualizar item");
        System.out.println("2 - Cadastrar item");
        System.out.println("3 - Atualizar item");
        System.out.println("4 - Deletar item");
        System.out.println("5 - Voltar...");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                
                break;
            case 2:
                this.dadosItens.cadastrarItem();
                exibirMenu();
            case 3:
                this.dadosItens.alterarItem();
                break;
            case 4:
                this.dadosItens.deletarItem();
                break;
            case 5:
                exibirMenu();
                break;
        
            default:
                break;
        }

        return opcao;

    }

}
