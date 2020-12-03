
package pratica07;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Caracteristicas caracteristicas;
    private String nascimento;
    private String pai;
    private String mae;
    private String localNascimento;
    private Identidade identidade;
    private Passaporte passaporte;
    private Endereco endereco;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(Caracteristicas caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public Identidade getIdentidade() {
        return identidade;
    }

    public void setIdentidade(Identidade identidade) {
        this.identidade = identidade;
    }

    public Passaporte getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(Passaporte passaporte) {
        this.passaporte = passaporte;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa() {
    }
    
    

    public Pessoa(String nome, Caracteristicas caracteristicas, String nascimento, String pai, String mae, String localNascimento, Identidade identidade, Passaporte passaporte, Endereco endereco) {
        this.nome = nome;
        this.caracteristicas = caracteristicas;
        this.nascimento = nascimento;
        this.pai = pai;
        this.mae = mae;
        this.localNascimento = localNascimento;
        this.identidade = identidade;
        this.passaporte = passaporte;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa:" + "\nNome=" + nome + 
                "\nCaracteristicas:\n" + caracteristicas + 
                "\nNascimento= " + nascimento + 
                "\nPai= " + pai + 
                "\nMae= " + mae + 
                "\nLocal de Nascimento= " + localNascimento + 
                "\nIdentidade: " + identidade + 
                "\nPassaporte: " + passaporte + 
                "\nEndereço:\n" + endereco + "\n";
    }
    
               
}
