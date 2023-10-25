

import br.edu.ifpi.poo.entidades.Conta;
import br.edu.ifpi.poo.notificacoes.Notificacao;

public class Contapoupanca extends Conta {
    private double taxaSaque;
    private double rendimento;

 public Contapoupanca(String numero, double abertura, Notificacao notificacao) {
        
        super(numero, abertura, notificacao);
    }
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor + (valor * taxaSaque);
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void depositar(double valor) {
        saldo += valor + (valor * rendimento);
        System.out.println("Depósito realizado com sucesso!");
    }

    @Override
    public void saque(double valor) {
        super.saque( valor + valor * 0.1);
    }

    @Override
    public void transferencia(double valor, Conta destino) {
    
    }
}