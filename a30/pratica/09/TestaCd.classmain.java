package pratica09;

import java.util.Date;

public class Pratica09 {

    public static void main(String[] args) {
        Pessoa zeze = new Pessoa("Zezé di Camargo");
        Pessoa luciano = new Pessoa("Luciano");
        CD zezeluciano = new CD("Roça", new Date(), zeze);
        zezeluciano.adicionarCantor(luciano);
        System.out.println(zezeluciano);
        zezeluciano.removerCantor(zeze);
        System.out.println(zezeluciano);
    }

}
