
package Q2;

/**
 *
 * @author wever
 */
public class Vendedor extends Empregado{
    
    private double valorVendas;
    private int qntVendas;
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public double getValorVendas() {
    
        return valorVendas;
}

    // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setValorVendas(double valorVendas) {
    
        this.valorVendas = valorVendas;
    }
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public int getQntVendas() {
    
        return qntVendas;
    }
    
    // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setQntVendas(int qntVendas) {
    
        this.qntVendas = qntVendas;
    }
}
