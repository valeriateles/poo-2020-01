
package pratica12;


public class Carro {
    private String placa;
    boolean disponivel;

    public Carro(String placa) {
        this.placa = placa;
        this.disponivel = true;
    }

   

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }
    public void disponivel(){
        this.disponivel=true;
         }
    
    public void indisponivel(){
        this.disponivel=false;
         }

    @Override
    public String toString() {
        return "Carro:\n" + "Placa=: " + placa + ", disponivel: " + disponivel;
    }
    
}
