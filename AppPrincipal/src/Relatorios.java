
import java.util.ArrayList;

public class Relatorios extends Transacao {

    static ArrayList<Object> somenteDebito (ArrayList<Transacao>ArrayList){
        
        return somenteDebito(listaTransacao);
        
     }
    static ArrayList<Object> somenteCredito (ArrayList<Transacao>ArrayList){
        
        return somenteCredito(listaTransacao);
        
     }
    static ArrayList<Object> somenteValorAbsolutoMaiorQue (ArrayList<Transacao>ArrayList, float valor){
        
        return somenteValorAbsolutoMaiorQue(listaTransacao,valor);
        
     }
    static ArrayList<Object> somenteNoMes (ArrayList<Transacao>ArrayList, int mes){
        
        return somenteNoMes(listaTransacao,mes);
        
     }

 
}