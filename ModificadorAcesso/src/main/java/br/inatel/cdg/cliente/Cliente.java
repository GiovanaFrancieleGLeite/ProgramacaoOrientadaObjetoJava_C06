package br.inatel.cdg.cliente;

public class Cliente {
    private String nome;
    private long cpf;

    //GET e SET
    public String getNome() {
        return nome;
    }
    public long getCPF() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCPF(long cpf) {
        this.cpf = cpf;
    }
}
