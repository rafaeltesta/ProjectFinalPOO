package br.com.unipar.exception;

public class InsufficientWithdrawalException extends RuntimeException {
    
    public InsufficientWithdrawalException() {
        super ("Saldo insuficiente para saque!");
    }
}
