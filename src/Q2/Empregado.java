
package Q2;


public class Empregado extends Pessoa {
    private double salario;
    private String matricula;
    
    
       void valorInss() {
    
           double inss =(salario * 0.11);
    }
    
    
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    public double getSalario() {
    
        return salario;
    }
    
       // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setSalario(double salario) {
    
        this.salario = salario;
    }
         //ENCAPSULAMENTO
    
   
    // (Get) ( metodo que retorna um valor e sem parâmetro )
    public String getMatricula() {
    
        return matricula;
    }
    
       // (Set) ( metodo que não retorna valor e com parâmetro )
    public void setMatricula(String matricula){
    
        this.matricula = matricula;
    }
    
    
    
}
