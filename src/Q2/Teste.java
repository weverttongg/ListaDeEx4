
package Q2;


public class Teste {
    public static void main(String[] args) {
        
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
    }
}
