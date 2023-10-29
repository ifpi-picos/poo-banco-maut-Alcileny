
package br.edu.ifpi.poo.notificacoes;

// nome de classe deve começar com letra maiuscula
public class notificacaoemail implements Notificacao {


    @Override
    public void enviaNotificacao(String tipo, double valor) {

        System.out.println("enviando notificacao por email, " + tipo + ", Valor: " + valor);
    }
}
