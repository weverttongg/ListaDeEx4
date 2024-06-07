
package Q3;

/**
 *
 * @author Wevertton
 */
public class Empregado extends  Pessoa {
  private int codigoSetor; 
  private  double salarioBase;
  private   double imposto;

  
  public void calcularSalario() {
  
      double calculo = salarioBase + imposto;
      System.out.println(calculo);
  
  }
  
    public int getCodigoSetor() {
        return codigoSetor;
    }

    
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

  
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

  
    public double getImposto() {
        return imposto;
    }

  
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
  
  
}
