package Exercicio05;

public class Ashen {
    String nome;
    int vida;
    Arma arma;

    void usarArma(){
        arma.resistenacia -= 2;
    }

    void tomarDano(){
        this.vida -= 5;
    }
}
