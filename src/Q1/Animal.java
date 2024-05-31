
package Q1;

/**
 *
 * @author wever
 */
public class Animal {
   private String nome;
   private double peso;
   
    //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
   public String getNome(){
   
       return nome;
   }
   
   
   // (Set) ( metodo que não retorna valor e com parâmetro )
   public void setNome(String nome) {
   
       this.nome = nome;
   }
   
   
   public double getPeso(){
    
       return peso;
   }
   
   public void setPeso(double peso) {
   
       this.peso = peso;
   }
   
   void mostar() {
       System.out.println("Nome: " + nome);
   }
   void mostrar2() {
       System.out.println("Peso: " + peso);
   }

  
   
   
   
   
   
   
   
}
