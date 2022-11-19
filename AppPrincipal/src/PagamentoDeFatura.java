
public abstract class PagamentoDeFatura extends TransacaoBancaria{
    public PagamentoDeFatura(){
        
    }
    /* public PagamentoDeFatura(Data data, float valor, Conta conta) {
        super(data, valor, conta);
    }
*/
    public PagamentoDeFatura( Data data, String identificador, float valor,Conta conta) {
        super( data, identificador, valor,conta);
    }

    @Override
    public String toString() {
        return "PagamentoDeFatura []";
    }
    
    
}
