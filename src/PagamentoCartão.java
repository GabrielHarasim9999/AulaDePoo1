public class PagamentoCartão implements Pagamento{
    public boolean pago(double valor){
        System.out.println("Pagamento via Cartão aprovado");
        return true;
    }
    public String getPagamento(){
        return "Cartão";
    }
}
