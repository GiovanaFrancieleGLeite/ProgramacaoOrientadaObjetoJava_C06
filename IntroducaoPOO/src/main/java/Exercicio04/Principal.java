package Exercicio04;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        zumbi1.vida = 100;
        Zumbi zumbi2 = new Zumbi();
        zumbi2.vida = 100;

        System.out.println("O primeiro zumbi tem " + zumbi1.vida + " e o segundo tem " + zumbi2.vida + " de vida.");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantia de vida que deseja tranferir do primeiro para o segundo: ");

        zumbi1.tranfereVida(zumbi2, entrada.nextInt());

        System.out.println("O primeiro zumbi tem " + zumbi1.vida + " e o segundo tem " + zumbi2.vida + " de vida.");

        entrada.close();
    }
}