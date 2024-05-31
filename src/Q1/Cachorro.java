
package Q1;

public class Cachorro extends Animal {
     String raca;
     
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
     public String getRaca(){
     
         return raca;
     }
     
        // (Set) ( metodo que não retorna valor e com parâmetro )
     public void setRaca(String raca){
     
         this.raca = raca;
     }

    @Override
    public String toString() {
        return "Raça: " + raca;
    }
     
     
}
