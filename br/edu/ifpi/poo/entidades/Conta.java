   package br.edu.ifpi.poo.entidades;

import br.edu.ifpi.poo.notificacoes.Notificacao;
   
public abstract class Conta {
   private String numero;
    protected double saldo;
    protected Notificacao notificacao;
    

    public Conta(String numero, double abertura, Notificacao notificacao){
        this.numero = numero;
        this.saldo = abertura;
        this.notificacao = notificacao;
    }
    
    public void saque(double valor){
        this.saldo -=  valor;
        this.notificacao.enviaNotificacao("saque", valor);

    }
      
    public abstract void transferencia(double valor, Conta destino);

    public double getSaldo() {
        return saldo;
    }
    public void setNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    
    public String getNumero() {
        return numero;
    }

    public void depositar(double valor) {
    }


public static void main (String []args) {

}
}



    

