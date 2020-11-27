
package pratica01;

public class Produto {
    private String descricao;
    private float preco;
    private float aliquota;

    
    public Produto(String descricao, float preco, float aliquota) {
        this.descricao = descricao;
        this.preco = preco;
        this.aliquota = aliquota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getAliquota() {
        return aliquota;
    }

    public void setAliquota(float aliquota) {
        this.aliquota = aliquota;
    }

    @Override
    public String toString() {
        return "Produto: " + descricao + ", preco RS: " + getPreco() * (1+ getAliquota()) + ", ";
    }

      
}
