
package pratica01;

import java.util.ArrayList;
import java.util.List;

public class Pratica01 {

    public static void main(String[] args) {
        Produto p1 = new Produto("Abacate", 2.5f, 0.2f);
        Produto p2 = new Produto("Bola", 50.0f, 0.1f);
        Produto p3 = new Produto("Cesta", 100.0f, 0.03f);
        
        
          
       List<ItemNotaFiscal> item = new ArrayList<>();
       ItemNotaFiscal item1 = new ItemNotaFiscal(p1, 40);
       item.add(item1);
       ItemNotaFiscal item2 = new ItemNotaFiscal(p2, 30);
       item.add(item2);
       ItemNotaFiscal item3 = new ItemNotaFiscal(p3, 10);
       item.add(item3);
         
        NotaFiscal nota = new NotaFiscal(item);
        
        System.out.println(nota);
    }
    
}
