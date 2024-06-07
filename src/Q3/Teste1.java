
package Q3;

public class Teste1 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        p.setNome("Marcos");
        p.setTelefone("61 9999-9999");
        p.setEndereco("Rua Paulista");
        System.out.println(p);
        
        
        Fornecedor f = new Fornecedor();
        f.setValorCredito(5000);
        f.setValorDivida(1700);
        f.obterSaldo();
        System.out.println(f);
        f.obterSaldo();
        
        Empregado e = new Empregado();
        
        e.setNome(nome);
        e.setEndereco(endereco);
        e.setTelefone(telefone);
        
        
    }
}
