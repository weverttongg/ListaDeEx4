
package Q2;


public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    

   
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    
    public String getNome() {
    
        return nome;
    }
    
       // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setNome(String nome){
    
        this.nome = nome;
    }
    
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public int getIdade(){
    
        return idade;
    }
       // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setIdade(int idade) {
    
        this.idade = idade;
    }
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public String getSexo() {
    
        return sexo;
    }
    
       // (Set) ( metodo que n�o retorna valor e com par�metro )
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
