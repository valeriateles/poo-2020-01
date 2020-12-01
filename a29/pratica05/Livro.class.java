
package pratica05;


public class Livro {
    
        private String titulo;
        private Pessoa autor;
        private Editora editora;
        private int ano;

    public Livro(String titulo, Pessoa autor, Editora editora, int ano) {
        setTitulo(titulo);  //entender melhor isso, a diferenca do this.nome
        setAutor(autor);
        setEditora(editora);
        setAno(ano);
    }

   

   
    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
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
        return "Livro: " + getTitulo() + "\n" + "Autor = " + getAutor().getNome() + 
                "\nAno de nascimento de " + getAutor().getNome() + ": " + getAutor().getAnoNasc() +  "\n" + getEditora() + "\n";
    }
}
