
public class Pix extends TransacaoBancaria{
    
    Terceiro terceiro;

    public Pix(Data data, String identificador, float valor, Conta conta, Terceiro terceiro) {
        super(data, identificador, valor, conta);
        this.terceiro = terceiro;
    }


    public Terceiro getTerceiro() {
        return terceiro;
    }

    public void setTerceiro(Terceiro terceiro) {
        this.terceiro = terceiro;
    }

   @Override
   public String toString(){
       return "Pix[terceiro = " + terceiro + "]";
   }

   
    
}
