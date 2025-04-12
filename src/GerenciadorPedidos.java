import edu.clezer.gerenciadorpedidos.model.pessoa.Cliente;
import edu.clezer.gerenciadorpedidos.view.Interface;

public class GerenciadorPedidos {
    public static void main(String[] args){

        Interface menu = new Interface();
        int opcao = menu.menu();

        switch (opcao) {
            case 1:
                menu.opcoesPedidos();
                break;
            case 2:
                menu.opcoesClientes();
                break;

            case 3:
                menu.opcoesItens();
                break;

            case 4:
                System.out.println("Saindo...");
                break;

            default:
                break;
        }
    }
}
