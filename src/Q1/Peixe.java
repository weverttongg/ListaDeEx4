
package Q1;



public class Peixe extends Animal {
    private String tipoHabitat;
    
    
     //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public String getTipoHabitat() {
    
        return tipoHabitat;
    }
    
    // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setTipoHabitat(String tipoHabitat) {
    
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString() {
        return "Tipo de Habitate: " + tipoHabitat;
    }
    
    
}
