package Exercicio05;

public class Principal {
    public static void main(String[] args) {
        // O objeto arma
        Arma arma = new Arma();
        arma.resistenacia = 100;
        arma.poder = 400;
        arma.descricao = "Espada do rei Artur";
        arma.nome = "Excalibur";

        // O objeto ashen
        Ashen ashen = new Ashen();
        ashen.nome = "Artur";
        ashen.vida = 1000;

        // Associacao
        ashen.arma = arma;

        // A arma perde a resistencia
        arma.mostrarIndoArma();
        ashen.usarArma();
        arma.mostrarIndoArma();

        // Artur perde vida
        System.out.println("Vida : " + ashen.vida);
        ashen.tomarDano();
        System.out.println("Vida : " + ashen.vida);
    }
}
