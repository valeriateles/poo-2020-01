package pratica01;

import java.util.List;

public class NotaFiscal {

    private List<ItemNotaFiscal> item;

    public NotaFiscal(List<ItemNotaFiscal> item) {
        this.item = item;

        System.out.println(item);
    }

    public float getTotal() {
        float concatena = 0.0f;
        for (ItemNotaFiscal itens : item) {
            concatena += itens.getTotal();
        }
        return concatena;
    }

    public ItemNotaFiscal getItem() {
        return (ItemNotaFiscal) item;
    }

    public void setItem(ItemNotaFiscal item) {
        this.item = (List<ItemNotaFiscal>) item;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" + "valor total= " + getTotal() + '}';
    }

}
