
public class CompraDebito extends CompraCartao {
    
    public CompraDebito(Data data, String identificador, float valor, Conta conta){
        super(data, identificador, valor, conta);
        this.conta.debitar(valor);
        DinheiroCarteira.quantia -= valor;
        //this.getConta().debitar(valor);
    
    }
    
    @Override
    public String toString(){
        return "Debito," + super.toString();
    }
    
    
}
