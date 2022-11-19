
public class CompraDinheiro extends TransacaoBancaria{

    public CompraDinheiro( Data data, String identificador, float valor,Conta conta) {
        super( data, identificador, valor,conta);
        DinheiroCarteira.quantia += valor;

       
    }

    public CompraDinheiro(Data data, float valor, Conta conta) {
        //super(data, valor, conta);
        //
        DinheiroCarteira.quantia += valor;
    }
    public CompraDinheiro(Data data, String string, int i) {
    }
    public CompraDinheiro(Data data, String identificador, float valor) {
        
        super(data, identificador, valor);
        DinheiroCarteira.quantia += valor;
    }

    @Override
    public String toString(){
        return "CompraDinheiro []";
    }
    
}
