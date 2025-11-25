package Exercicio02.conversor;

public class Conversor {
    private int moeda = 0;

    public void Conversor(int pontos) {
        moeda = pontos * 100;
    }

    public int getMoeda() {
        return moeda;
    }
}
