package br.dev.joaquim.bank;

import br.dev.joaquim.exception.InsufficientFundsException;

/**
 * Representa uma conta bancária com operações de depósito e saque.
 * <p>
 * Valida transações e mantém o estado da conta.
 * </p>
 * 
 * @author Antonio Pereira
 * @see InsufficientFundsException
 */

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    /** Construtor padrão. */
    public BankAccount() {
    }

    /**
     * Cria uma conta com parâmetros específicos.
     * @param accountNumber Número da conta
     * @param balance Saldo inicial
     * @param accountHolderName Nome do titular
     */
    public BankAccount(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    /** @return Número da conta */
    public int getAccountNumber() {
        return accountNumber;
    }

    /** @return Saldo atual */
    public double getBalance() {
        return balance;
    }

    /** @return Nome do titular */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Deposita um valor na conta.
     * @param value Valor a ser depositado
     * @throws IllegalArgumentException Se o valor for negativo
     */
    public void deposit(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
        }
        this.balance += value;
    }

    /**
     * Saca um valor da conta.
     * @param value Valor a ser sacado
     * @throws InsufficientFundsException Se o saldo for insuficiente
     * @throws IllegalArgumentException Se o valor for negativo
     */
    public void withdraw(double value) throws InsufficientFundsException {
        if (value < 0) {
            throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
        }

        if (value > this.balance) {
            throw new InsufficientFundsException("O valor R$ " + value + " é superior ao saldo [R$ " + this.balance + "]");
        }
        this.balance -= value;
    }

    /** @return Dados da conta formatados */
    @Override
    public String toString() {
        return "Conta " + accountNumber + " de " + accountHolderName + " têm R$ " + balance + " de saldo";
    }
}