
public class Data{
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }



    static Data convData(String data){
        int dia = Integer.valueOf(data.substring(0,1));
        int mes = Integer.valueOf(data.substring(3,4));
        int ano = Integer.valueOf(data.substring(6,10));
        Data D = new Data(dia, mes, ano);
        return D;
    }


    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    @Override
    public String toString() {
        return + dia + "/" + mes + "/" + ano + "";
    }

}