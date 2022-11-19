
public abstract class CompraCartao extends TransacaoBancaria {

    public CompraCartao(Data data, String identificador, float valor,Conta conta) {
        super(data, identificador, valor,conta);
    }
    
    
    @Override
    public String toString() {
        return super.toString();
    };
  

    

     
}
