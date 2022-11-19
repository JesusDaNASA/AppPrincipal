
public abstract class CompraCredito extends CompraCartao {
    private int nVezes;
    
    
    public CompraCredito(Data data, String identificador, float valor, Conta conta,int nVezes){
        super(data, identificador, valor, conta);
        this.nVezes = nVezes;
        this.getConta().reterLimite(valor);

    }  
    public CompraCredito(Data data, String identificador, float valor, Conta conta){
        super(data, identificador, valor, conta);
        this.getConta().reterLimite(valor);  
    }
    
    
    
    
    @Override
    public String toString(){
        return "Crédito," + super.toString() + "," +nVezes + "x";
    
    }
    
    
    
}
