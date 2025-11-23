package Execicio01.br.inatel.cdg.main;

import java.util.Scanner;
import Execicio01.br.inatel.cdg.inimigo.asteroide.Asteroide;
import Execicio01.br.inatel.cdg.jogador.nave.Nave;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int asteroidesDestruidos = 0;
        final int MAX_ASTEROIDES = 3;

        System.out.println("--- CONFIGURAÇÃO DA NAVE ---");
        System.out.print("Digite o tipo de tiro da nave Tardis (Normal/Explosivo): ");
        Nave nave = new Nave("Tardis", 50, sc.next());

        System.out.println("\n--- INÍCIO DO JOGO: VIDA ATUAL: " + nave.getVida() + " ---");
        System.out.println("OBJETIVO: Destruir " + MAX_ASTEROIDES + " asteroides. Cada falha custa 10 de vida.");

        while (nave.getVida() > 0 && asteroidesDestruidos < MAX_ASTEROIDES) {

            System.out.println("\n------------------------------------");
            System.out.print("Rodada " + (asteroidesDestruidos + 1) + "/" + MAX_ASTEROIDES +
                    ". Vida: " + nave.getVida() + ". Digite o tipo de asteroide (Pequeno/Grande): ");

            Asteroide novoAsteroide = new Asteroide("A-007", sc.next());

            double vidaAntesDoTiro = nave.getVida();

            nave.atirar(novoAsteroide);

            if (nave.getVida() < vidaAntesDoTiro) {

                System.out.println("VIDA PERDIDA. Vida restante: " + nave.getVida());
            } else {
                asteroidesDestruidos++;
            }
        }


        System.out.println("\n====================================");

        if (asteroidesDestruidos == MAX_ASTEROIDES) {
            System.out.println("PARABÉNS! Você destruiu " + MAX_ASTEROIDES + " asteroides com sucesso!");
            System.out.println("Vida final: " + nave.getVida());
        } else {
            System.out.println("GAME OVER! A nave " + nave.getNome() + " foi destruída.");
        }

        System.out.println("====================================");
        sc.close();
    }
}