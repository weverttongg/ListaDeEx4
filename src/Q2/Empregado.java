
package Q2;


public class Empregado extends Pessoa {
    private double salario;
    private String matricula;
    
    
       void valorInss() {
    
           double inss =(salario * 0.11);
    }
    
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public double getSalario() {
    
        return salario;
    }
    
       // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setSalario(double salario) {
    
        this.salario = salario;
    }
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem par�metro )
    public String getMatricula() {
    
        return matricula;
    }
    
       // (Set) ( metodo que n�o retorna valor e com par�metro )
    public void setMatricula(String matricula){
    
        this.matricula = matricula;
    }
    
    
    
}
