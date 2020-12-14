
package pratica10;

import java.util.ArrayList;

public class Animal {
    private String nome;
    private ArrayList<Animal> amigos = new ArrayList<>();

    public Animal(String nome) {
        this.nome = nome;
            }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Animal> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Animal> amigos) {
        this.amigos = amigos;
    }
    
    public void adicionarAmigo(Animal animal){
        amigos.add(animal);
    }
    public void removerAmigo(Animal animal){
        amigos.remove(animal);
    }
    @Override
    public String toString() {
        return getNome();
    }
    
    public String amigosAnimal(){
        return amigos.toString();
    }
    
}
