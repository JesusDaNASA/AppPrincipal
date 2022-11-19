
public class PagBoleto extends Boleto {

    public PagBoleto(Data data, String identificador, float valor,Conta conta) {
        super( data, identificador, valor,conta);
    }
    
    @Override
    public String toString() {
        return "PagBoleto []";
    }
    
}
