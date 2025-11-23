package Execicio01.br.inatel.cdg.jogador.nave;

import Execicio01.br.inatel.cdg.inimigo.asteroide.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tiro;
    }


    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void atirar(Asteroide ast){
        System.out.println("A nave " + this.nome + " esta atirando com um " + this.tipoTiro + " contra o asteroide " + ast.getNome() + " do tipo " +  ast.getTipoAsteroide() + ".");

        if(this.tipoTiro.equalsIgnoreCase("Explosivo") && ast.getTipoAsteroide().equalsIgnoreCase("Grande")){
            ast.destruir();
        } else if (this.tipoTiro.equalsIgnoreCase("Explosivo") && ast.getTipoAsteroide().equalsIgnoreCase("Pequeno")) {
            ast.destruir();
        } else if (this.tipoTiro.equalsIgnoreCase("Normal") && ast.getTipoAsteroide().equalsIgnoreCase("Pequeno")){
            ast.destruir();
        }
        // Coparando, ignorando a caixa maiusculo e minuscula
        else if(this.tipoTiro.equalsIgnoreCase("Normal") && ast.getTipoAsteroide().equalsIgnoreCase("Grande")){
            if (this.vida > 0){
                System.out.println("Nao foi possivel destruir o Asteroide. Voce perdeu vida");
                this.vida -= 10;
            }
        }
    }
}