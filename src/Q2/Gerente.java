
package Q2;


public class Gerente extends  Empregado{
    private String nomeGerencia;
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public String getNomeGerencia() {
    
        return nomeGerencia;
    }
    
    // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setNomeGerencia(String nomeGerencia) {
    
        this.nomeGerencia = nomeGerencia;
    }
    
    
}
