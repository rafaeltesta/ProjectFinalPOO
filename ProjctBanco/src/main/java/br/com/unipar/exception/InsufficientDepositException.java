package br.com.unipar.exception;

public class InsufficientDepositException extends RuntimeException{
    
    public InsufficientDepositException() {
        super ("O valor menor que 0,00!");
    }
}
