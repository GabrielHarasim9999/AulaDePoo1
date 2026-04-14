import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private int idRestaurante;
    public String nomeRestaurante;
    protected String enderecoRestaurante;

    private List<Produto> cardapio = new ArrayList<>();

    public Restaurante(int idRestaurante, String nomeRestaurante, String enderecoRestaurante){
        this.idRestaurante = idRestaurante;
        this.nomeRestaurante = nomeRestaurante;
        this.enderecoRestaurante = enderecoRestaurante;
    }
    public void adicionarProduto(Produto produto){
        cardapio.add(produto);

    }

    public List<Produto> getCardapio(){
        return cardapio;
    }

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public String getEnderecoRestaurante() {
        return enderecoRestaurante;
    }
    public String getNomeRestaurante(){
        return nomeRestaurante;
    }

    public void setCardapio(List<Produto> cardapio) {
        this.cardapio = cardapio;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public void setEnderecoRestaurante(String enderecoRestaurante) {
        this.enderecoRestaurante = enderecoRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }
}
