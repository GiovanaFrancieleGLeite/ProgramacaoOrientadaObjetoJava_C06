package Exercicio02.principal;

import Exercicio02.bloco.Bloco;
import Exercicio02.conversor.Conversor;
import Exercicio02.jogador.Jogador;

public class Principal {
    public static void main(String[] args) {
        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();
        Bloco bloco5 = new Bloco();

        Jogador jogador = new Jogador();

        jogador.DestruirBloco(bloco1);
        System.out.println("O jogador destruiu um bloco");
        System.out.println("ponto: " + jogador.getPontos());
        System.out.println("================================");

        jogador.DestruirBloco(bloco2);
        System.out.println("O jogador destruiu um bloco");
        System.out.println("ponto: " + jogador.getPontos());
        System.out.println("================================");

        jogador.DestruirBloco(bloco3);
        System.out.println("O jogador destruiu um bloco");
        System.out.println("ponto: " + jogador.getPontos());
        System.out.println("================================");

        Conversor conversor = new Conversor();
        conversor.Conversor(jogador.getPontos());

        System.out.println("--------RESULTADO--------");
        System.out.println("O numero de blocos criados: " + Bloco.getNumeroBlocoCriado());
        System.out.println("O numero de blocos destruidos: " + Bloco.getNumeroBlcooDestruido());
        System.out.println("O numero de pontos do jogados: " + conversor.getMoeda());
    }
}
