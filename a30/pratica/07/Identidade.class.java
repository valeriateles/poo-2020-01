
package pratica07;



public class Identidade {
    private int numero;
    private String emissao;
    private String orgaoEmissor;
    private String cpf;
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
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

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public Identidade(int numero, String emissao, String orgaoEmissor, String cpf) {
        this.numero = numero;
        this.emissao = emissao;
        this.orgaoEmissor = orgaoEmissor;
        this.cpf = cpf;
    }
    
    
   

    @Override
    public String toString() {
        return "\nNumero ID=" + numero + 
                "\nEmissao ID=" + emissao + 
                "\nOrgaoEmissor ID=" + orgaoEmissor + 
                "\nCPF=" + cpf ;
    }

    
    
}
