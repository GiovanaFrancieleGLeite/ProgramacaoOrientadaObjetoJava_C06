package Exercicio06;

public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;

    public Kart () {
        motor = new Motor();
    }

    void pular(){
        System.out.println("Pulando");
    }

    void soltarTurbo(){
        System.out.println("Soltando Turbo");
    }

    void fazerDrift(){
        System.out.println("Fazendo Drift");
    }
}
