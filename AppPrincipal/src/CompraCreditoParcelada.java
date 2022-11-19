
public class CompraCreditoParcelada extends CompraCredito {

    private float valorParcelas;
    
    public CompraCreditoParcelada(Data data, String identificador, float valor, Conta conta, int nVezes) {
        super(data, identificador, valor, conta, nVezes);
        this.setValorParcelas(valor/nVezes);
        
       
        
}

    public float getValorParcelas() {
        return valorParcelas;
    }

    public void setValorParcelas(float valorParcelas) {
        this.valorParcelas = valorParcelas;
    }
    @Override
    public String toString() {
        return "CompraCreditoParcelada [valorParcelas=" + valorParcelas + "]";
    }
}
