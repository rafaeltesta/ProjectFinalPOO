package br.com.unipar.exception;

public class InsufficientDateException extends RuntimeException {
    
    public InsufficientDateException() {
        super ("O resultado n�o pode ser com data nula!");
    }
}
