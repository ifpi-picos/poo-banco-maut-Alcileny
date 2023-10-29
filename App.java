import br.edu.ifpi.poo.entidades.Conta;
import br.edu.ifpi.poo.entidades.Contacorrente;
import br.edu.ifpi.poo.notificacoes.Notificacaosms;
import br.edu.ifpi.poo.notificacoes.notificacaoemail;

public class App {

  public static void main(String[] args) {
    Conta cc = new Contacorrente("1", 0, new Notificacaosms());
    Conta cp = new Contapoupanca("2", 0, new notificacaoemail());

    Cliente c = new Cliente("Joao", "12344444", null);
    c.adicionarConta(cp);
    c.adicionarConta(cc);

    cp.depositar(100);
    cp.saque(10);

    cc.depositar(100);

    // transferencia não está funcionando
    cc.transferencia(10, cp);
    cc.transferencia(10, cp);
    cc.transferencia(10, cp);

    System.out.println(cc.getSaldo());
    System.out.println(cp.getSaldo());
  }

}
