import java.util.ArrayList;

public class Transacao {
    static ArrayList<Transacao>listaTransacao= new ArrayList<>();

    
    private Data data;
    private String identificador;
    private float valor;
    private String tipo;



    public Transacao(Data data, String identificador, float valor) {
        if(valor<0){
            this.setTipo("SAIDA");
        }else{
            this.setTipo("ENTRADA");
        }
        this.setData(data);
        this.setIdentificador(identificador);
        this.setValor(valor);
      
    }

    public Transacao(){
        
    }
    


    @Override
    public String toString() {
        return ""+ data.toString()+ "," + identificador + "," + valor + "," + tipo+ ", ";
    }

    static ArrayList<Transacao>getListaTrasacao(){
        return listaTransacao;
    }

    static void setListaTrasacao(ArrayList<Transacao> listaTransacao) {
        Transacao.listaTransacao = listaTransacao;
    }
    

    public Data getData() {
        return data;
    }

    private void setData(Data data) {
        this.data = data;
    }

    public String getIdentificador() {
        return identificador;
    }

    private void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public float getValor() {
        return valor;
    }

    private void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    static class getListaTrasacao {

        public getListaTrasacao() {
        }
    }


}



    
 
    /*
    public Transacao(Data data, String identificador, float valor, Conta conta){
        new CompraDebito(data, identificador, valor, conta, nParcelas);   
    }
    public Transacao(Data data, String identificador, float valor, Conta conta, int nParcela){
        new CompraCredito(data, identificador, valor, conta, nParcelas);
    }
    
    @Override
    public String toString(){
        return data + "," + identificador + "," + valor;
    }
*/


   
    

    
    
    
    
