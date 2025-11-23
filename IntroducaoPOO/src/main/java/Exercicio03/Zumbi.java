package Exercicio03;

public class Zumbi {

    double vida;
    String nome;

    public double getVida(){
        return vida;
    }

    // Método para transferir vida para outro zumbi
    public void tranfereVida(Zumbi zumbiAlvo, double quantia){
        this.vida -= quantia;
        zumbiAlvo.vida += quantia;
    }

}