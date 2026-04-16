import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int  idPedido;

    private Cliente cliente;
    private Entregador entregador;

    private List<ItensPedido> itens = new ArrayList<>();

    public  Pedido(int idPedido, Cliente cliente){
        this.idPedido = idPedido;
        this.cliente = cliente;
    }

    public void adicionarItem(ItensPedido item){
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0;
        for (ItensPedido item : itens){
            total += item.SubTotal();
        }
        return  total;
    }

public int getId(){
        return idPedido;
}
    public void finalizarPedido(){
        double total = calcularTotal();
    }
    public Cliente getCliente(){
        return cliente;
    }
    public Entregador getEntregador(){
        return entregador;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    public void setItens(List<ItensPedido> itens) {
        this.itens = itens;
    }
}
