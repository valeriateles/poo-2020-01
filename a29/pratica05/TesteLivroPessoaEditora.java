
package pratica05;
public class TesteLivroPessoaEditora {
     public static void main(String[] args) {
       Pessoa p = new Pessoa("René Descartes", 1596);
       Editora ed = new Editora("Martin Claret", "Rua Alegrete, 62, Bairro Sumaré");
       Livro l = new Livro("Discurso do Método", p, ed,2002);
       
        System.out.println(l);
    }
}
