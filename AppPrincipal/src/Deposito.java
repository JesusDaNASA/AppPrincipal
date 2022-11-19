
public class Deposito extends TransacaoBancaria{

    public Deposito(Data data, String identificador,float valor, Conta conta) {
        super(data, identificador,valor, conta);
    }
    public Deposito(Data data, String identificador, float valor) {
        super(data, identificador, valor);
    }
        public Deposito(Data data,float valor, Conta conta) {
       // super(data,valor, conta);
    }

    @Override
    public Conta getConta() {
        return conta;
    }

    @Override
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    @Override
    public String toString() {
        return "Deposito []";
    }
}
