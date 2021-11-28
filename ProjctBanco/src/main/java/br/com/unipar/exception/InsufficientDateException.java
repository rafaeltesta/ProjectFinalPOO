package br.com.unipar.exception;

public class InsufficientDateException extends RuntimeException {
    
    public InsufficientDateException() {
        super ("O resultado não pode ser com data nula!");
    }
}
