
package pratica12;

import java.util.Date;

public class Locacao {
    private Date dataInicio;
    private Date dataFim;
    private int kmInicio;
    private int kmFim;
    private float valorKm;
    private float valorDia;
    private Motorista motorista;
    private Carro carro;

    public Locacao() {
    }

    public Locacao(Date dataInicio, Date dataFim, int kmInicio, int kmFim, float valorKm, float valorDia, Motorista motorista, Carro carro) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.kmInicio = kmInicio;
        this.kmFim = kmFim;
        this.valorKm = valorKm;
        this.valorDia = valorDia;
        this.motorista = motorista;
        this.carro = carro;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public int getKmInicio() {
        return kmInicio;
    }

    public void setKmInicio(int kmInicio) {
        this.kmInicio = kmInicio;
    }

    public int getKmFim() {
        return kmFim;
    }

    public void setKmFim(int kmFim) {
        this.kmFim = kmFim;
    }

    public float getValorKm() {
        return valorKm;
    }

    public void setValorKm(float valorKm) {
        this.valorKm = valorKm;
    }

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
        this.carro.indisponivel();
            }
    
    public void dataLocacao(Date dataInicio, Date dataFim){
        setDataInicio(dataInicio);
        setDataFim(dataFim);
    }
    
    public void rodagem(int kmInicio, int kmFim){
        setKmInicio(kmInicio);
        setKmFim(kmFim);
    }
    
    public float custo(){
        float distancia = kmFim-kmInicio;
        long nDias = dataFim.getTime() - dataInicio.getTime();
        nDias = nDias / (1000 * 60 * 60 * 24); // tentar entender como funciona a data 
               return distancia*valorKm +nDias*valorDia;
    }

    @Override
    public String toString() {
        String saida = "Motorista: ";
        saida += getMotorista().toString() + "\n";
        saida += getCarro().toString() + "\n";
        saida += "Quilometragem inicial: " + getKmInicio();
        saida += "; final: " + getKmFim() + "\n";
        saida += "Data locacao: " + getDataInicio().toString();
        saida += "; data de entrega: " + getDataFim().toString() + "\n";
        saida += "R$/km: " + getValorKm() + "; valor do R$/dia: " + getValorDia();
        saida += "\nCusto da locacao: " + custo();

        return saida;
    }
    
}
