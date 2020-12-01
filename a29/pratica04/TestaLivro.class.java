
package pratica04;

public class TestaLivro {
     public static void main(String[] args) {
       Livro livro1 =new Livro("The Da Vince Code","Dan Brown", "Doubleday",2003);
       Livro livro2 = new Livro("Nome do livro", "autor do livro", "Editora dele", 2019);
       Livro livro3 = new Livro("Livro 3", "autor do terceiro", "editora o 3",2020);
    
         System.out.println(livro1);
         System.out.println(livro2);
         System.out.println(livro3);
     }
}
