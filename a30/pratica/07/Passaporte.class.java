
package pratica07;




public class Passaporte {
    private int numero;
    private String emissao;
    private String validade;
    private String orgaoEmissor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmissao() {
        return emissao;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public Passaporte(int numero, String emissao, String validade, String orgaoEmissor) {
        this.numero = numero;
        this.emissao = emissao;
        this.validade = validade;
        this.orgaoEmissor = orgaoEmissor;
    }

    @Override
    public String toString() {
        return "\nNumero: " + getNumero() + 
                "\nEmissao= " + getEmissao() + 
                "\nValidade= " + getValidade() + 
                "\nOrgaoEmissor= " + getOrgaoEmissor() ;
    }
    
    
}
