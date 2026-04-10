public class EntregaDrone  extends Entrega{
    public EntregaDrone(Pedido pedido){
        super(pedido);
    }

    @Override
    public void realizarEntrega(){
        System.out.print("Entrega sendo realizada por DRONE");
    }
}
