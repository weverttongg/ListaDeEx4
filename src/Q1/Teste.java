
package Q1;

public class Teste {
    public static void main(String[] args) {
        
        //Definindo os atributos da classe peixe
        Peixe p = new Peixe();
        
        System.out.println("----------SOBRE O PEIXE----------------");
        p.setNome("Nemo");
        p.setPeso(2);
        p.setTipoHabitat("Aquario ou Mar");
        p.mostar();
        p.mostrar2();
        System.out.println(p);
        
        
        //Definindo atributos da classe Cachorro
        Cachorro c = new Cachorro();
        
        System.out.println("----------SOBRE O DOG------------------");
        c.setNome("Spike");
        c.setPeso(23);
        c.setRaca("Caramelo");
        c.mostar();
        c.mostrar2();
        System.out.println(c);
        
        
    }
 
}
