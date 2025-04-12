package edu.clezer.gerenciadorpedidos.controller;

import edu.clezer.gerenciadorpedidos.model.item.Item;
import edu.clezer.gerenciadorpedidos.model.pessoa.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosUsuario {
    private List<Pessoa> usuarios = new ArrayList<>();
    
    public void cadastrarUsuario(){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o documento ou registro do Usuario");
        int codigo = input.nextInt();
        input.nextLine(); // Lê a linha vazia

        System.out.println("Insira o nome do Usuario");
        String nome = input.nextLine();

        System.out.println("Insira o telefone do Usuario");
        String telefone = input.nextLine();

        System.out.println("Insira o e-mail do Usuario");
        String email = input.nextLine();

        System.out.println("Insira o nível de acesso do Usuario");
        System.out.println("1 - Cliente");
        System.out.println("2 - Funcionário");
        System.out.println("3 - Gerente");
        String tipoAcesso = input.nextLine();

        System.out.println("Insira uma observação");
        String observacao = input.nextLine();

        switch (tipoAcesso) {
            case "1":
                Cliente cliente = new Cliente(codigo, nome, telefone, email, "Cliente");
                if (!observacao.isEmpty()) cliente.setObservação(observacao);
                usuarios.add(cliente);
                break;

            case "2":
                Funcionario funcionario = new Funcionario(codigo, nome, telefone, email, "Funcionário");
                ;
                if (!observacao.isEmpty()) funcionario.setObservação(observacao);
                usuarios.add(funcionario);
                break;

            case "3":
                Gerente gerente = new Gerente(codigo, nome, telefone, email, "Gerente");
                if (!observacao.isEmpty()) gerente.setObservação(observacao);
                usuarios.add(gerente);
                break;

            default:
                System.out.println("Tipo de acesso inválido.");
                return;
        }
        

        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void atualizarUsuario(){

    }

    public void deletarUsuario(){

    }

    public String getNome(int codigoReferencia) {
        for (Pessoa pessoa : usuarios) {
            if (pessoa.getNumeroId() == codigoReferencia) {
                return pessoa.getNome();
            }
        }
        return null; 
    }
}
