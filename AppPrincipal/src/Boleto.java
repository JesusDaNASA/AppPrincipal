public abstract class Boleto extends TransacaoBancaria{

    public Boleto(Data data, String identificador, float valor,Conta conta) {
        super(data, identificador, valor,conta);
    }

    public Boleto(Data data, float valor, Conta conta) {
        //super(data, valor, conta);
    }

    public Boleto(Data data,String identificador, float valor) {
        super(data, identificador, valor);
    }
    public Boleto(){
        
    }




    @Override
    public String toString() {
        return "Boleto []";
    }
    
}
