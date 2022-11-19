
import java.util.ArrayList;


public abstract class TransacaoBancaria extends Transacao{    
    Conta conta;
    
    public TransacaoBancaria( Data data, String identificador, float valor,Conta conta) {
        super(data, identificador, valor);
        this.conta = conta;
    }

   public TransacaoBancaria(){
        
    }
        
    
    public TransacaoBancaria(Data data, String identificador, float valor){
        super(data, identificador,valor);
    }
    

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return  ""+super.toString()+""+conta.getNome()+"";
    }
    
}
