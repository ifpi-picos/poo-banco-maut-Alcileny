package br.edu.ifpi.poo.entidades;

import java.util.ArrayList;
import br.edu.ifpi.poo.notificacoes.Notificacao;

public class Contacorrente extends Conta {
  private double chequeEspecial;

  public Contacorrente(String numero, double abertura, Notificacao notificacao) {

    super(numero, abertura, notificacao);
  }


  public void sacar(double valor) {
    if (valor > (saldo + chequeEspecial)) {
      System.out.println("Saldo insuficiente!");
    } else if (valor <= saldo) {
      saldo -= valor;
      System.out.println("Saque realizado com sucesso!");
    } else {
      chequeEspecial -= (valor - saldo);
      saldo = 0;
      System.out.println("Saque realizado com sucesso!");
      notificacao.enviaNotificacao("sacar", valor);
      new ArrayList<>();
    }
  }

  public void depositar(double valor) {
    saldo += valor;
    System.out.println("Depósito realizado com sucesso!");
    notificacao.enviaNotificacao("deposito", valor);
    new ArrayList<>();
  }

  // método com nome diferente do que deveria
  public void transferir(double valor, Conta destino) {
    if (valor > (saldo + chequeEspecial)) {
      System.out.println("Saldo insuficiente!");
    } else if (valor <= saldo) {
      saldo -= valor;
      destino.depositar(valor);
      System.out.println("Transferência realizada com sucesso!");
    } else {
      chequeEspecial -= (valor - saldo);
      saldo = 0;
      destino.depositar(valor);
      System.out.println("Transferência realizada com sucesso!");
      notificacao.enviaNotificacao("transferir", valor);
      new ArrayList<>();
    }

  }

  // método sem implementação
  @Override
  public void transferencia(double valor, Conta destino) {

  }
}
