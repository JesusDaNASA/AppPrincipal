import java.util.ArrayList;

public class Conta implements iConta{

    private String nome;
    private float saldo;
    private float limite;
    private float limiteDisponivel;
    private Data diaPagamentoFatura;
    private Data diaFechamentoFatura;
    private float totalTransacaoAgendada;
    private String tipo;
    private static ArrayList<Conta>contas = new ArrayList<Conta>();


    
    public Conta(String nome, float saldo, float limite) {
        if(limite==0){
            this.setTipo("Conta Debito");
        }else{
            this.setTipo("Conta Debito/Credito");
        }
        this.setNome(nome);
        this.setSaldo(saldo);
        this.setLimite(limite);
        this.setLimiteDisponivel(limite);
        contas.add(this);
        this.setTotalTransacaoAgendada(0);

    }

    @Override
    public void debitar(float valor){
        this.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public void reterLimite(float valor){
        if (limiteDisponivel > valor){
            this.setLimiteDisponivel(this.getLimiteDisponivel() + valor);
            
        }
        else{
            System.out.println("LIMITE INSUFICIENTE");
            this.setLimiteDisponivel(this.getLimiteDisponivel() * 0);
        }

        
        
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    private void setLimite(float limite) {
        this.limite = limite;
    }

    public float getLimiteDisponivel() {
        return limiteDisponivel;
    }

    private void setLimiteDisponivel(float limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
        // mexi aqui e piorei tudo kjkjk
    }

    public Data getDataPagamentoFatura() {
        return diaPagamentoFatura;
    }

    private void setDataPagamentoFatura(Data diaPagamentoFatura) {
        this.diaPagamentoFatura = diaPagamentoFatura;
    }

    public Data getDataFechamentoFatura() {
        return diaFechamentoFatura;
    }

    private void setDataFechamentoFatura(Data diaFechamentoFatura) {
        this.diaFechamentoFatura = diaFechamentoFatura;
    }

    public String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Conta [nome="+this.getNome()+",saldo="+this.getSaldo()+", limite=" +String.valueOf(this.getLimite())+", limiteDisponivel=" +String.valueOf(this.getLimiteDisponivel())+", tipo=" +this.getTipo()+", Valor Agendado="+String.valueOf(this.getTotalTransacaoAgendada())+"]";
    }


    static void statusContas(){   
        for(int i=0; i<contas.size();i++){
            System.out.println(contas.get(i).toString());
        }
        
    }; 

    @Override
 
     public void retornarLimite(float valor){
        this.setLimiteDisponivel(this.getLimiteDisponivel()+valor);
    }

    @Override
    public void depositar(float valor){
        this.setSaldo(this.getSaldo()+valor);
    }

    public Data getDiaPagamentoFatura(){
        return diaPagamentoFatura;
    }

    public void setDiaPagamentoFatura(Data diaPagamentoFatura){
        this.setDataPagamentoFatura(diaPagamentoFatura);
    }

    public Data getDiaFechamentoFatura() {
        return diaFechamentoFatura;
    }

    public void setDiaFechamentoFatura(Data diaFechamentoFatura) {
        this.diaFechamentoFatura = diaFechamentoFatura;
    }

    public float getTotalTransacaoAgendada() {
        return totalTransacaoAgendada;
    }

    public void setTotalTransacaoAgendada(float valor) {
        this.totalTransacaoAgendada = totalTransacaoAgendada + valor;
    }

    public static ArrayList<Conta> getContas() {
        return contas;
    }
    public static void setContas(ArrayList<Conta> contas) {
        Conta.contas = contas;
    }

}
