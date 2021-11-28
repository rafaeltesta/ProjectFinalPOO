package br.com.unipar;

import br.com.unipar.entities.CheckingAccount;
import br.com.unipar.entities.SavingsAccount;
import java.util.Date;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        Date dateOne = new Date(12/8/2020);
        Date dateTwo = new Date(20/9/2020);
        
        try {
            CheckingAccount checkingAccount = new CheckingAccount();
            checkingAccount.getOverdraftLimit(400);
            checkingAccount.extractByPeriod(dateOne, dateTwo);
            checkingAccount.getBankBalanceByDate(dateOne);
            checkingAccount.cashDeposit(500);
            checkingAccount.cashOut(450);
            System.out.println(checkingAccount.getBalance());

            SavingsAccount savingsAccount = new SavingsAccount();
            savingsAccount.extractByPeriod(dateOne, dateOne);
            savingsAccount.getBankBalanceByDate(dateTwo);
            savingsAccount.cashDeposit(400);
            savingsAccount.cashOut(150);
            System.out.println(savingsAccount.getBalance());

        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }
    
}
