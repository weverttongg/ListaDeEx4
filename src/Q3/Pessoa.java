
package Q3;


public class Pessoa {
   private String nome;
   private String endereco;
   private String telefone;
   
            //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
   public String getNome(){
   
       return nome;
   } 
       // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setNome(String nome){
    
        this.nome = nome;
    }
   
            //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public String getEndereco() {
    
        return endereco;
    }
       // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setEndereco(String endereco) {
    
        this.endereco = endereco;
    }
   
            //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public String getTelefone() {
    
        return telefone;
    }
       // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setTelefone(String telefone){
    
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }
   
    
}
