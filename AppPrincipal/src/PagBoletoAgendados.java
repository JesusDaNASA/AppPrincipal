public class PagBoletoAgendados extends Boleto {
    private Data dataDeAgendamento;

    public PagBoletoAgendados(Data data, String identificador, float valor,Conta conta,Data dataDeAgendamento) {
        super(data, identificador, valor,conta);
        this.setDataDeAgendamento(dataDeAgendamento);
    }

    public PagBoletoAgendados(Data data, String string, int i, Conta bb) {
    }

    public Data getDataDeAgendamento() {
        return dataDeAgendamento;
    }

    public void setDataDeAgendamento(Data dataDeAgendamento) {
        this.dataDeAgendamento = dataDeAgendamento;
    }

    @Override
    public String toString() {
        return "PagBoletoAgendados [dataDeAgendamento=" + dataDeAgendamento + "]";
    }
    
}

