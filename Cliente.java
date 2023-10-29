import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.poo.entidades.Conta;

// Cliente deveria ter endereco.
public class Cliente {
    private String nome;
    private String cpf;
    private String dataNascimento; // campo deveria ser do tipo de Date ou LocalDate
    private List<Conta> contas;

    public Cliente(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void removerConta(Conta conta) {
        contas.remove(conta);
    }
}
