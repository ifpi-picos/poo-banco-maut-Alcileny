import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta { 
    private String agencia;
    private String numero;
    private double saldo;
    private List<Transacoes> historico;

    public Conta(String agencia, String numero,double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.historico = new ArrayList<>();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            Transacoes transacao = new Transacoes("Depósito", valor, new Date());
            historico.add(transacao);
        }
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            Transacoes transacao = new Transacoes("Saque", -valor, new Date());
            historico.add(transacao);
            return true;
        }
        return false;
    }

    public void imprimirHistorico() {
        System.out.println("Histórico de Transações da Conta:");
        for (Transacoes transacao : historico) {
            System.out.println(transacao);
        }
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transacoes> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Transacoes> historico) {
        this.historico = historico;
    }
}


