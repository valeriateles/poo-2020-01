package pratica07;

public class Pratica07 {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Caracteristicas pc = new Caracteristicas("negra", 77.0f, "verdes", 1.77f, "loiros");
        Endereco pe = new Endereco("Rua Abacate", 877, "Oeste", 57885);
        p.setNome("julia");
        p.setLocalNascimento("Maternidade Venha pro mundo");
        p.setCaracteristicas(pc);
        p.setEndereco(pe);
        p.setMae("Jorgete Mariete");
         p.setPai("Jorge Mario");
        p.setNascimento("10/05/1987");
        Passaporte pp = new Passaporte(57897,"10/05/2000", "10/05/2020", "Agencia Nacional Brasileira de Viagens");
        p.setPassaporte(pp);
        Identidade id = new Identidade(4578084,"28/12/1999", "DGPC GO", "789.654.485-78");
        p.setIdentidade(id);
        
        
        
        System.out.println(p);
    }
    
}
