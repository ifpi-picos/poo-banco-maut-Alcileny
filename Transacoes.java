import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Nome da classe deveria ser no singular
public class Transacoes {
    private String tipo;
    private double valor;
    private Date dataHora;
    private List<String> transacoes; // atributo desnecessário

    public Transacoes(String tipo, double valor, Date dataHora) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = dataHora;
        this.transacoes = new ArrayList<>();
    }

    public void imprimirHistorico() {
        System.out.println("Extrato:");
        int index = 1;
        for (String transacoes : this.transacoes) {

            System.out.println(index + "-" + transacoes.toString());

        }

    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public Date getDataHora() {
        return dataHora;
    }


    public String toString() {
        return "Transacao [Tipo: " + tipo + ", Valor: " + valor + ", Data e Hora: " + dataHora
                + "]";
    }
}

