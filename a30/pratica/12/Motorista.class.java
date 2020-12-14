
package pratica12;


public class Motorista {
    private String nome;
    private String codigo;

    public Motorista(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
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
        return "Motorista: " + getNome() + "\nCodigo: " + getCodigo();
    }
    
}
