package Exercicio06;

public class Principal {
    public static void main(String[] args) {
        Kart kart1 = new Kart();
        kart1.nome = "Rosa";
        kart1.motor.cilindrada = "100";
        kart1.motor.velocidadeMaxima = 50;

        Piloto piloto1 = new Piloto();
        piloto1.nome = "Penelope Xarmoza";
        piloto1.vilao = false;

        kart1.piloto = piloto1;

        kart1.pular();
        kart1.fazerDrift();
        kart1.soltarTurbo();
        System.out.println(kart1.piloto.nome);

    }
}
