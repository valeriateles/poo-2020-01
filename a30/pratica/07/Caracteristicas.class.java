
package pratica07;

public class Caracteristicas {
    private String pele;
    private float peso;
    private String olhos;
    private float altura;
    private String cabelos;

    public Caracteristicas() {
    }

    public Caracteristicas(String pele, float peso, String olhos, float altura, String cabelos) {
        this.pele = pele;
        this.peso = peso;
        this.olhos = olhos;
        this.altura = altura;
        this.cabelos = cabelos;
    }

    public String getPele() {
        return pele;
    }

    public float getPeso() {
        return peso;
    }

    public String getOlhos() {
        return olhos;
    }

    public float getAltura() {
        return altura;
    }

    public String getCabelos() {
        return cabelos;
    }

    @Override
    public String toString() {
        return "Cor da pele= " + pele + 
                "\nPeso= " + peso + 
                "\nCor dos olhos= " + olhos + 
                "\nAltura= " + altura + 
                "\nCor dos cabelos= " + cabelos ;
    }

    public void setPele(String pele) {
        this.pele = pele;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setOlhos(String olhos) {
        this.olhos = olhos;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setCabelos(String cabelos) {
        this.cabelos = cabelos;
    }
    
    
}
