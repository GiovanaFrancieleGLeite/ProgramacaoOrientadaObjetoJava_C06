package Exercicio02.jogador;

import Exercicio02.bloco.Bloco;

public class Jogador {
    private int pontos = 0;

    public void DestruirBloco(Bloco bloco){
        bloco.Destruido();
        this.pontos++;
    }

    public int getPontos() {
        return pontos;
    }
}
