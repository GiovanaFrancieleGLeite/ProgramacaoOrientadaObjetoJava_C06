package Execicio01.br.inatel.cdg.inimigo.asteroide;

public class Asteroide {
    private String nome;
    private String TipoAsteroide;

    public Asteroide(String nome, String TipoAsteroide){ //Construtor
        this.nome = nome;
        this.TipoAsteroide = TipoAsteroide;
    }
    public void destruir(){
        System.out.println("O Asteroide do nome " + this.nome + " e do tipo " + this.TipoAsteroide + " foi destruido!");
    }


    public String getNome() {
        return nome;
    }

    public String getTipoAsteroide() {
        return TipoAsteroide;
    }
}
