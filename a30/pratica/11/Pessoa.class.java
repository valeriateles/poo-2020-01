
package pratica11;

import java.util.ArrayList;



public class Pessoa {
    private String nome;
    private ArrayList<Telefone> telefones = new ArrayList<>();//diferença de ArrayList para HashSet

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaTelefone(Telefone t){
        telefones.add(t);
    }
    
    public void removeTelefone(Telefone t){
        telefones.remove(t);
    }
   

    @Override
    public String toString() {
        return getNome() + " - telefones: " + telefones.toString();
    }
    
    
}
