
package pratica01;

public class ItemNotaFiscal {
    private Produto produto;
    private int quantidade;

    
    public ItemNotaFiscal(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public float getTotal(){
        float precoComImposto = produto.getPreco() * (1 + produto.getAliquota());
        return  precoComImposto * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return produto + "quantidade: " + quantidade + " Un, valor do Item=" + getTotal() + "\n\n";
    }

   
}
