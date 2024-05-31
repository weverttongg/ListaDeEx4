
package Q2;


public class Gerente extends  Empregado{
    private String nomeGerencia;
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    public String getNomeGerencia() {
    
        return nomeGerencia;
    }
    
    // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setNomeGerencia(String nomeGerencia) {
    
        this.nomeGerencia = nomeGerencia;
    }
    
    
}
