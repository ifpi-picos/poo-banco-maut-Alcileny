
package br.edu.ifpi.poo.notificacoes;

public class notificacaoemail implements Notificacao {

    
    @Override
    public void enviaNotificacao(String tipo, double valor) {
        
        System.out.println("enviando notificacao por email, " + tipo + ", Valor: " + valor);
    }
}