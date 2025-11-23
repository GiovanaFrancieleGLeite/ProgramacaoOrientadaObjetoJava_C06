package Exercicio03;

public class Principal {

    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        zumbi1.vida = 50;
        Zumbi zumbi2 = new Zumbi();
        zumbi2.vida = 30;

        System.out.println("O primeiro zumbi tem " + zumbi1.vida + " e o segundo tem " + zumbi2.vida + " de vida.");

        zumbi1 = zumbi2;

        //O zumbi1 passa ter o mesmo enderoço de memoria que o zumbi2
        System.out.println("O primeiro zumbi tem " + zumbi1.vida + " e o segundo tem " + zumbi2.vida + " de vida.");
        
    }
}