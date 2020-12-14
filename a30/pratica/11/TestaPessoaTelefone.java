
package pratica11;


public class Pratica11 {//TestaPessoaTelefone

       public static void main(String[] args) {
        Pessoa pessoa= new Pessoa("Maria");
        Pessoa p= new Pessoa("João");
        pessoa.adicionaTelefone(new Telefone("(62) 3598-3673"));//como remover quando adicionado assim ?
        pessoa.adicionaTelefone(new Telefone("(66) 3598-3773"));
        pessoa.adicionaTelefone(new Telefone("(64) 3598-3373"));
        pessoa.adicionaTelefone(new Telefone("(68) 3598-3778"));
        pessoa.adicionaTelefone(new Telefone("(61) 3598-3713"));
        Telefone t1 = new Telefone("(58) 9985-5665");
        pessoa.adicionaTelefone(t1);
        p.adicionaTelefone(new Telefone("(61) 3598-3713"));

        System.out.println(pessoa);
        pessoa.removeTelefone(t1); 
        System.out.println(pessoa);
        System.out.println(p);
    }
    
}
