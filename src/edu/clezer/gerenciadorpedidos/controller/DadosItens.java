package edu.clezer.gerenciadorpedidos.controller;

import edu.clezer.gerenciadorpedidos.model.item.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DadosItens {
    private List<Item> itens = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void cadastrarItem(){
        System.out.println("Digite a descrição do item");
        String descricao = input.nextLine();

        System.out.println("Digite a valor unitário do item");
        Double valor = input.nextDouble();

        System.out.println("Digite a código de referencia do item");
        int idItem = input.nextInt();
        input.nextLine();

        System.out.println("Digite a peso do item");
        Double peso = input.nextDouble();

        Item item = new Item(idItem, descricao, valor, peso);

        itens.add(item);
        
        System.out.println("Item cadastrado com sucesso!");

    }

    public void alterarItem() {
        System.out.println("Digite o código de referência do item que deseja alterar:");
        int idItem = input.nextInt();
        input.nextLine();  
    
        Item itemEncontrado = null;
        for (Item item : itens) {
            if (item.getIdItem() == idItem) {
                itemEncontrado = item;
                break;
            }
        }
    
        if (itemEncontrado != null) {
            System.out.println("Item encontrado: " + itemEncontrado.getDescricao());
            System.out.println("Digite a nova descrição do item (ou deixe em branco para manter):");
            String novaDescricao = input.nextLine();
            if (!novaDescricao.isEmpty()) {
                itemEncontrado.setDescricao(novaDescricao);
            }
    
            System.out.println("Digite o novo valor unitário do item (ou 0 para manter):");
            Double novoValor = input.nextDouble();
            if (novoValor > 0) {
                itemEncontrado.setValor(novoValor);
            }
    
            System.out.println("Digite o novo peso do item (ou 0 para manter):");
            Double novoPeso = input.nextDouble();
            if (novoPeso > 0) {
                itemEncontrado.setPeso(novoPeso);
            }
    
            System.out.println("Item alterado com sucesso!");
        } else {
            System.out.println("Item não encontrado com o código fornecido.");
        }
    }
    
    public void deletarItem() {
        System.out.println("Digite o código de referência do item que deseja deletar:");
        int idItem = input.nextInt();
        input.nextLine();  

        boolean itemRemovido = false;
        for (Item item : itens) {
            if (item.getIdItem() == idItem) {
                itens.remove(item);
                itemRemovido = true;
                break;
            }
        }
    
        if (itemRemovido) {
            System.out.println("Item deletado com sucesso!");
        } else {
            System.out.println("Item não encontrado com o código fornecido.");
        }
    }
    
    public Double getValorUnitario(int codigoReferencia) {
        for (Item item : itens) {
            if (item.getIdItem() == codigoReferencia) {
                return item.getValor();
            }
        }
        return null; 
    }
}
