
package Q2;


public class Cliente  extends Pessoa {
    private double valorDivida;
    private int anoNascim;
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public double getValorDivida(){
    
        return valorDivida;
    }
    
       // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setValorDivida(double valorDivida) {
    
        this.valorDivida = valorDivida;
    }
            //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public int getAnoNascim() {
    
        return anoNascim;
    }
    
       // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setAnoNascim(int anoNascim) {
    
        this.anoNascim = anoNascim;
    }

    @Override
    public String toString() {
        return "Valor da Divida: R$" + valorDivida + ", Ano de Nascimento:" + anoNascim + '}';
    }
   
    
}
