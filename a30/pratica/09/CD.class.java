
package pratica09;

import java.util.ArrayList;
import java.util.Date;


public class CD {
    private Date dataLancamento;
    private String nome;
    private Pessoa pessoa;
    private ArrayList<Pessoa> cantores =new ArrayList<>(); //nao preciso vincular cantores a Pessoa?

    public CD( String nome, Date dataLancamento, Pessoa cantor) {
        setDataLancamento(dataLancamento);
        setNome(nome);
        adicionarCantor(cantor);
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList getCantores() {
        return cantores;
    }

    public void setCantores(ArrayList cantores) {
        this.cantores = cantores;
    }
    
public void adicionarCantor(Pessoa cantor){
    cantores.add(cantor);
}
public void removerCantor(Pessoa cantor){
    cantores.remove(cantor);
}

    @Override
    public String toString() {
        String saida = "CD: " + nome + "\nData de Lnaçamento: " + getDataLancamento() + "\nCantores:\n";
        for (int i = 0; i < cantores.size(); i++) {
            saida += cantores.get(i).toString() + "\n"; //estudar e entender melhor isso.
        }
        return saida;
    }

}
