package pratica07;

public class Endereco {

    private String rua;
    private int numero;
    private String setor;
    private int cep;
    private String cidade;
    private String estado;
    private String pais;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Endereco(String rua, int numero, String setor, int cep, String cidade, String estado, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.setor = setor;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public Endereco(String rua, int numero, String setor, int cep) {
        this.rua = rua;
        this.numero = numero;
        this.setor = setor;
        this.cep = cep;
        this.cidade = "Goiânia";
        this.estado = "Goiás";
        this.pais = "Brasil";
    }

    public boolean valida(int cep) {
        if (cep < 10000000 || cep > 99999999){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public String toString() {
        if(valida(cep)){
        return "Rua=" + rua + 
                "\nNumero= " + numero + 
                "\nSetor= " + setor + 
                "\nCep= " + cep + 
                "\nCidade= " + cidade + 
                "\nEstado= " + estado + 
                "\nPais= " + pais;
        }
        else{
            return "Rua=" + rua + 
                "\nNumero= " + numero + 
                "\nSetor= " + setor + 
                "\nCep Inválido" +
                "\nCidade= " + cidade + 
                "\nEstado= " + estado + 
                "\nPais= " + pais;
            
        }
    }

    
    
}
