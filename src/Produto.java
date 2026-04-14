public class Produto {
    public String nomeProduto;
    private int idProduto;
    public String descricao;
    protected double preco;
    public Categoria categoria;
    private int estoque;

    public Produto(int idProduto, String nomeProduto, String descricao, double preco, Categoria categoria, int estoque){

        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = estoque;
    }
    public double getPreco(){
        return preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    public  void setNome(String nome){
        this.nomeProduto = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public Categoria getCategoria(){
        return  categoria;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public void reduzirEstoque(int quantidade){
        if(quantidade <= estoque){
            estoque -= quantidade;
            }else{
                System.out.println("Estoque Indisponível!");
        }
    }
    public void adicionarEstoque(int quantidade){

            estoque += quantidade;
    }
}
