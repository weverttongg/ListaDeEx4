
package Q3;


public class Fornecedor extends Pessoa{
    
    private double valorCredito;
    private double valorDivida;
    
    
    
    
    
    public void  obterSaldo() {
        
     double calculo=  valorCredito - valorDivida; 
      double diferenca = calculo;
        System.out.println("diferen�a: " + diferenca);
    }
             //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
   public double getValorCredito() {
   
       return valorCredito;
   } 
       // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setValorCredito(double valorCredito) {
    
        this.valorCredito = valorCredito;
    }
            //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public double getValorDivida() {
    
        return valorDivida;
    }
       // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setValorDivida(double valorDivida) {
    
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return "valor do Credito=" + valorCredito + ", valor da Divida=" + valorDivida;
    }
 
}
