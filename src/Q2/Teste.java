
package Q2;


public class Teste {
    public static void main(String[] args) {
        
        //Definindo os atributos da classe 
        Cliente c = new Cliente();
        
        c.setNome("Pedro");
        c.setIdade(23);
        c.setSexo("Masculino");
        c.setValorDivida(533);
        c.setAnoNascim(2000);
        c.mostar();
        c.mostrar2();
        c.mostrar3();
        System.out.println(c);
        
        //Definindo os atributos da classe 
        
        Gerente g = new Gerente();
        
        g.setNome("Lucas");
        g.setIdade(24);
        g.setSexo("Masculino");
        g.setSalario(2500);
        g.setMatricula("3344-3");
        g.setNomeGerencia("Recursos Humanos");
        
        
       //Definindo os atributos da classe 
       
         Vendedor v = new Vendedor();
        
        v.setNome("Nathalia");
        v.setIdade(24);
        v.setSexo("Feminino");
        v.setSalario(1900);
        v.setMatricula("5654-3");
    }
}

