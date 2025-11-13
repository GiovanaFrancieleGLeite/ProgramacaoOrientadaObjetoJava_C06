package Exercicio02;

public class Membro {
    private String nome;
    private String funcao;

    public void membro(String nome, String funcao){
        this.nome = nome;
        this.funcao = funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }
}

