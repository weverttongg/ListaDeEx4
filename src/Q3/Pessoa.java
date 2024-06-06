
package Q3;


public class Pessoa {
   private String nome;
   private String endereco;
   private String telefone;
   
            //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
   public String getNome(){
   
       return nome;
   } 
       // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setNome(String nome){
    
        this.nome = nome;
    }
   
            //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    public String getEndereco() {
    
        return endereco;
    }
       // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setEndereco(String endereco) {
    
        this.endereco = endereco;
    }
   
            //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    public String getTelefone() {
    
        return telefone;
    }
       // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setTelefone(String telefone){
    
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }
   
    
}
