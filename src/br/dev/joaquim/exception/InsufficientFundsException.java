package br.dev.joaquim.exception;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// throw new InsufficientFundsException ("Saldo Insuficiente")