
package pratica12;


public class Motorista {
    private String nome;
    private String codigo;
    CNH cnh;
    private int tempoServico;
    

    public Motorista(String nome, String codigo, CNH cnh, int tempoServico) {
        this.nome = nome;
        this.codigo = codigo;
        this.cnh = cnh;
        this.tempoServico = tempoServico;
    }

     
     
    public CNH getCnh() {
        return cnh;
    }

    public void setCnh(CNH cnh) {
        this.cnh = cnh;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
      @Override
    public String toString() {
        return "Motorista: " + getNome() + "\nCodigo: " + getCodigo() + "\nCNH tipo: " + getCnh() + "\nTempo de serviço: " + getTempoServico() +" anos";
    }

   
    
}
