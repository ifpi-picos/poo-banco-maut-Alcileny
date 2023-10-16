import java.util.Date;

public class Transacoes {
    private String tipo;
    private double valor;
    private Date dataHora;

    public Transacoes(String tipo, double valor, Date dataHora) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = dataHora;
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
        return "Transacao [Tipo: " + tipo + ", Valor: " + valor + ", Data e Hora: " + dataHora + "]";
    }
}

