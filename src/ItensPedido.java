public class ItensPedido {
    protected  Produto produto;
    protected int quantidade;
    protected  double precoUnitario;
    private int idItensPedido;

    public ItensPedido(int idItensPedido, Produto produto, int quantidade){
        this.idItensPedido = idItensPedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco();
    }

    public double SubTotal(){
        return precoUnitario * quantidade;
    }
}
