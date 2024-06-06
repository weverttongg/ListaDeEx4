
package Q3;


public class Fornecedor extends Pessoa{
    
    private double valorCredito;
    private double valorDivida;
    
    
    
    
    
    public void  obterSaldo() {
        
     double calculo=  valorCredito - valorDivida; 
      double diferenca = calculo;
        System.out.println("diferença: " + diferenca);
    }
             //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
   public double getValorCredito() {
   
       return valorCredito;
   } 
       // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setValorCredito(double valorCredito) {
    
        this.valorCredito = valorCredito;
    }
            //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    public double getValorDivida() {
    
        return valorDivida;
    }
       // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setValorDivida(double valorDivida) {
    
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return "valor do Credito=" + valorCredito + ", valor da Divida=" + valorDivida;
    }
 
}
