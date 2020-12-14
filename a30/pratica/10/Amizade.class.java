
package pratica10;

public class Amizade {
    private Animal amigo;

    public Amizade() {
    }

    public void criaAmizade(Animal amigo1, Animal amigo2) {
        amigo2.adicionarAmigo(amigo1);
        amigo1.adicionarAmigo(amigo2);
    }
    public void criaAmizade(Animal amigo1, Animal amigo2, Animal amigo3) {
        amigo2.adicionarAmigo(amigo1);
        amigo2.adicionarAmigo(amigo3);
        amigo1.adicionarAmigo(amigo2);
        amigo1.adicionarAmigo(amigo3);
        amigo3.adicionarAmigo(amigo1);
        amigo3.adicionarAmigo(amigo2);
    }
     public void removeAmizade(Animal amigo1, Animal amigo2){
        amigo2.removerAmigo(amigo1);
        amigo1.removerAmigo(amigo2);
}
      public void removeAmizade(Animal amigo1, Animal amigo2, Animal amigo3) {
        amigo2.removerAmigo(amigo1);
        amigo2.removerAmigo(amigo3);
        amigo1.removerAmigo(amigo2);
        amigo1.removerAmigo(amigo3);
        amigo3.removerAmigo(amigo1);
        amigo3.removerAmigo(amigo2);
    }
}
