package pratica02;


public class Pratica02 { //TestaAnimais

  
    public static void main(String[] args) {
        
        Animal[] animais = new Animal[3];
        animais[0] = new Sapo();
        animais[1] = new Boi();
        animais[2] = new Cachorro();

        System.out.println(animais[0].som());
        System.out.println(animais[1].som());
        System.out.println(animais[2].som());
    }
    }
