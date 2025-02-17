package br.dev.joaquim.bank;

import br.dev.joaquim.exception.InsufficientFundsException;

public class BankAccount {
  private int accountNumber;
  private double balance;
  private String accountHolderName;

  public BankAccount() {
  }

  public BankAccount(int accountNumber, double balance, String accountHolderName) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.accountHolderName = accountHolderName;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void deposit(double value) {

    if (value < 0) {
      throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
    }

    this.balance += value;
  }

  public void withdraw(double value) throws InsufficientFundsException {

    if (value < 0) {
      throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
    }

    if (value > this.balance) {
      // Não deveria ser assim, não pode ter print a classe
      throw new InsufficientFundsException("O valor R$ " + value + " é superior ao saldo [R$ " + this.balance + "]");
    }
    this.balance -= value;
  }

  @Override
  public String toString() {
    return "Conta " + accountNumber + " de " + accountHolderName + " têm R$ " + balance + " de saldo";
  }
}
