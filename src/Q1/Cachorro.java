
package Q1;

public class Cachorro extends Animal {
     String raca;
     
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
     public String getRaca(){
     
         return raca;
     }
     
        // (Set) ( metodo que n�o retorna valor e com par�metro )
     public void setRaca(String raca){
     
         this.raca = raca;
     }

    @Override
    public String toString() {
        return "Ra�a: " + raca;
    }
     
     
}
