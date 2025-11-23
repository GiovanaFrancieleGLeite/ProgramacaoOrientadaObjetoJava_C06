package Exercicio03;

import java.util.Random; //Aleadoria
import java.util.Scanner;  //Entrada

public class CampoMinado {
    static void main(String[] args) {
        boolean[][] campoMinado = new boolean[2][2];

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int posicaoX = aleatorio.nextInt(2); // De 0 a 1
        int posicaoY = aleatorio.nextInt(2);

        campoMinado[posicaoX][posicaoY] = true;

        System.out.println("X = " + posicaoX + " Y = " + posicaoY);

        System.out.println("CAMPO MINADO");

        int contador = 0;

        while (contador < 3){
            System.out.println("Digite a posicao X: ");
            int posicaoXentrada = entrada.nextInt();
            System.out.println("Digite a posicao Y: ");
            int posicaoYentrada = entrada.nextInt();

            if(campoMinado[posicaoXentrada][posicaoYentrada] == true){
                System.out.println("EXPLODIU");
                break;
            }
            else {
                System.out.println("Boa! Seguro");
                contador++;
            }
        }

        System.out.println("\nJogo encerrado");
        entrada.close();
    }
}
