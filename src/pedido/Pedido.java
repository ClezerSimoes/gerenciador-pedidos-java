package pedido;
import java.sql.Date;


public class Pedido {
    private int idPedido;
    private int idCliente;
    private int idItens;
    private Date data;
    private Date prazo;
    private String status;
    private double valor;
    private String observacaoPedido;

    public Pedido(int idPedido, int idCliente, int idItens, Date prazo, double valor) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.idItens = idItens;
        this.prazo = prazo;
        this.valor = valor;
    } 

    
}
