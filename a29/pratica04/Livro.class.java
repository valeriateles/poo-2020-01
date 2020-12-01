
package pratica04;


public class Livro {
        private String titulo;
        private String autor;
        private String editora;
        private int ano;

    public Livro(String titulo, String autor, String editora,int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;        
    }
        
        

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
   
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return getTitulo() + "\n" + getAutor() + "\n" + getEditora() + ", " + getAno() + "\n";
    }
 
      
}
