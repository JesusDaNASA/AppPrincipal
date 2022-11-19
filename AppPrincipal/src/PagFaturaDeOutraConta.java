
public class PagFaturaDeOutraConta extends PagamentoDeFatura{
    private Conta contaPaga;

    public PagFaturaDeOutraConta(Data data, String identificador, float valor, Conta conta,Conta contaPaga) {
        super(data, identificador, valor, conta);
        this.setContaPaga(contaPaga);
    }
    public PagFaturaDeOutraConta(Data data, float valor, Conta bb, Conta nb) {
    //construtor padrão
    }

    
    public Conta getContaPaga() {
        return contaPaga;
    }

    public void setContaPaga(Conta contaPaga) {
        this.contaPaga = contaPaga;
    }
    @Override
    public String toString() {
        return "PagamentoDeFaturaOutraConta [contaPaga=" + contaPaga + "]";
    }

    
    

    
    
}
