package Exercicio02;

public class Empresario {
    private String nome;
    private String cnpj;

    public Empresario(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    // GET e SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }
}
