package runner;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.Relatorio;

public class Main {
   
    
    public static void main(String[] args) {
        operacoes();
    }
    public static void operacoes(){
        ContaCorrente  c= new ContaCorrente();
        ContaPoupanca  p= new ContaPoupanca();
        
        c.setNumeroDeConta(1029);
        c.depositar(2500);
        
        p.setNumeroDeConta(3712);
        p.depositar(2000);
        
        p.sacar(1000);
        
        Relatorio relatorio = new Relatorio();
        
        relatorio.gerarRelatorio(p);
    }
    
    
}
