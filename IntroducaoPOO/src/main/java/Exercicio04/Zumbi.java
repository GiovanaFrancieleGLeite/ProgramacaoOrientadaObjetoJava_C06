package Exercicio04;

public class Zumbi {

    double vida;
    String nome;

    public double getVida(){
        return vida;
    }

    // Método para transferir vida para outro zumbi
    public void tranfereVida(Zumbi zumbiAlvo, double quantia){
        if(this.vida > quantia){
            this.vida -= quantia;
            zumbiAlvo.vida += quantia;
        }else {
            System.out.println("Impossivel transferencia. A vida do zumbi é: " + this.vida + ". Nao é possivel transferencia: " + quantia);
        }

    }

}