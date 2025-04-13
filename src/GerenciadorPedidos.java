import edu.clezer.gerenciadorpedidos.controller.DadosItens;
import edu.clezer.gerenciadorpedidos.controller.DadosPedidos;
import edu.clezer.gerenciadorpedidos.controller.DadosUsuario;
import edu.clezer.gerenciadorpedidos.view.Interface;

public class GerenciadorPedidos {
    public static void main(String[] args){

        DadosUsuario dadosUsuario = new DadosUsuario();
        DadosItens dadosItens = new DadosItens();
        DadosPedidos dadosPedidos = new DadosPedidos(dadosItens, dadosUsuario);

        Interface menu = new Interface(dadosUsuario, dadosItens, dadosPedidos);
        menu.exibirMenu();

    }
}
