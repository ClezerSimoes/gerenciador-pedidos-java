import edu.clezer.gerenciadorpedidos.model.pessoa.Cliente;
import edu.clezer.gerenciadorpedidos.view.Interface;

public class GerenciadorPedidos {
    public static void main(String[] args){

        Cliente teste = new Cliente(1234567890, "Kawan", "99887766", "kakaw@email.com", "Cliente");
        System.out.printf("Nome: %s %nTelefone: %s", teste.getNome(), teste.getTelefone());

    }
}
