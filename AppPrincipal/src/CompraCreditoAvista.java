
public class CompraCreditoAvista extends CompraCredito {

    public CompraCreditoAvista(Data data, String identificador, float valor, Conta conta) {
        super(data, identificador, valor, conta, 1);
        conta.reterLimite(valor);

    }

    @Override
    public String toString() {
        return "Credito, "+super.toString()+" ";
    }


    
    
}
