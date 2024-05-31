
package Q2;


public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    

   
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    
    public String getNome() {
    
        return nome;
    }
    
       // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setNome(String nome){
    
        this.nome = nome;
    }
    
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    public int getIdade(){
    
        return idade;
    }
       // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setIdade(int idade) {
    
        this.idade = idade;
    }
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    public String getSexo() {
    
        return sexo;
    }
    
       // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setSexo(String sexo){
    
        this.sexo = sexo;
    }
    
        void mostar() {
       System.out.println("Nome: " + nome);
   }
   void mostrar2() {
       System.out.println("Idade: " + idade);
   }
    
   void mostrar3() {
       System.out.println("Sexo: " +sexo);
   }
}
