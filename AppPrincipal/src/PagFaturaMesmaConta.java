
public class PagFaturaMesmaConta extends PagamentoDeFatura {

    public PagFaturaMesmaConta(Data data, String identificador, float valor, Conta conta) {
        super(data, identificador, valor, conta);
    }
    public PagFaturaMesmaConta(){
        
    }

    PagFaturaMesmaConta(Data data,float valor, Conta nb) {
    }

    @Override
    public String toString() {
        return "PagFaturaMesmaConta []";
    }
    
    
}
