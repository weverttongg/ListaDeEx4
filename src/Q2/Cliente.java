
package Q2;


public class Cliente  extends Pessoa {
    private double valorDivida;
    private int anoNascim;
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    public double getValorDivida(){
    
        return valorDivida;
    }
    
       // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setValorDivida(double valorDivida) {
    
        this.valorDivida = valorDivida;
    }
            //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    public int getAnoNascim() {
    
        return anoNascim;
    }
    
       // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setAnoNascim(int anoNascim) {
    
        this.anoNascim = anoNascim;
    }

    @Override
    public String toString() {
        return "Valor da Divida: R$" + valorDivida + ", Ano de Nascimento:" + anoNascim + '}';
    }
   
    
}
