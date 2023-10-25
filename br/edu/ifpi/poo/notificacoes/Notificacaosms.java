package br.edu.ifpi.poo.notificacoes;


public class Notificacaosms implements Notificacao{

    @Override
    public void enviaNotificacao(String tipo, double valor) {
        // corpo/implementação do método
        System.out.println("enviando notificacao por SMS, "+ tipo + ", Valor: "+ valor);
    }
}
