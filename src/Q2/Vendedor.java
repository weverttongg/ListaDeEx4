
package Q2;

/**
 *
 * @author wever
 */
public class Vendedor extends Empregado{
    
    private double valorVendas;
    private int qntVendas;
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    public double getValorVendas() {
    
        return valorVendas;
}

    // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setValorVendas(double valorVendas) {
    
        this.valorVendas = valorVendas;
    }
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    public int getQntVendas() {
    
        return qntVendas;
    }
    
    // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setQntVendas(int qntVendas) {
    
        this.qntVendas = qntVendas;
    }
}
