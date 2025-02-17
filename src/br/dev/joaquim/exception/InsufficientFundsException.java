package br.dev.joaquim.exception;

/**
 * Exceção lançada quando um saque excede o saldo disponível.
 * @author Antonio Pereira
 */
public class InsufficientFundsException extends Exception {
    /**
     * Cria uma exceção com mensagem personalizada.
     * @param message Descrição do erro
     */
    public InsufficientFundsException(String message) {
        super(message);
    }
}