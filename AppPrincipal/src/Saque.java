
public class Saque extends TransacaoBancaria{

    public Saque(Data data, String identificador, float valor) {
        super(data, identificador, valor);        
        DinheiroCarteira.quantia -= valor;
        
    }

    public Saque(Data data, int i, Conta bb) {
    }
    
    public Saque(Data data, float valor, Conta conta){
    
    }

    @Override
    public String toString() {
        return "Saque []";
    }
}
