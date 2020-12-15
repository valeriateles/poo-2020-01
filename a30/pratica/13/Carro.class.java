
package pratica12;

import static pratica12.Categoria.luxo;
import static pratica12.Categoria.simples;
import static pratica12.Categoria.superluxo;
import static pratica12.Tipo.passeio;
import static pratica12.Tipo.utilitario;


public class Carro {
    private String placa;
    Tipo tipo;
    Categoria categoria;
    float taxa;

    public Carro(String placa) {
        this.placa = placa;
    }

    public Carro(String placa, Tipo tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }
    
    public Carro(String placa, Tipo tipo, Categoria categoria) {
        this.placa = placa;
        this.tipo = tipo;
        this.categoria = categoria;
        
    }

    
  public float setTaxa(){
      if(tipo==passeio ){
          if(categoria == luxo)
          taxa=(float) 1.1;
          else if(categoria == superluxo)
              taxa=(float) 1.2;
          else
              taxa=(float) 1.0;
      }
               
      else if(tipo==utilitario )
          taxa=(float) 1.15;
          
return taxa;      
  }

    public String getPlaca() {
        return placa;
    }

   
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }
    
    @Override
    public String toString() {
        return "Carro com placa=: " + placa +
                "\nTipo: " + tipo + "; categoria: " + categoria;
    }
    
}
