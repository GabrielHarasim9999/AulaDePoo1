public abstract class Entrega {
    protected  Pedido pedido;

    public Entrega(Pedido pedido){
        this.pedido = pedido;
    }

    public void iniciarEntrega(){
        System.out.println("Preparando entrega do pedido #" + pedido.getId());
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }


    public abstract void realizarEntrega();
}
