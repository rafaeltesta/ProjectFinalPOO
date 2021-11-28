package modelo;

import javax.swing.JOptionPane;

public class ContaPoupanca extends ContaBancaria implements Imprimivel{
	
    private final double limite = -100;

    @Override
    public void sacar(double valor){
        if( (super.getSaldo()-valor) >= limite){
            super.setSaldo(super.getSaldo()-valor);
             JOptionPane.showMessageDialog(null,"Levantamento ralizado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"O levantamento nao pode ser realizado");
        }            
    }
    
    @Override
    public void depositar(double valor){
        super.setSaldo(super.getSaldo()+valor);    
        JOptionPane.showMessageDialog(null,"Deposito realizado com sucesso");
    }
    
    @Override
    public void mostrarDados() {
        String dados="Numero da conta: "+super.getNumeroDeConta()+"\n"+
                "Saldo actual: "+super.getSaldo()+"\n"+
                "Limite: "+ this.limite;
        JOptionPane.showMessageDialog(null,dados);
    }

    public double getLimite() {
        return limite;
    }
    
}
