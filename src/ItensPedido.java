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

    public int getIdItensPedido() {
        return idItensPedido;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setIdItensPedido(int idItensPedido) {
        this.idItensPedido = idItensPedido;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
