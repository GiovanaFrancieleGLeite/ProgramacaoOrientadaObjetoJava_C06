import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    static void main(String[] args) {
        //Criar objeto para ler as entradas
        Random gerador = new Random();

        //Criar objeto para gerar um numero aleatorio
        Scanner ler = new Scanner(System.in);

        // Gerar um numero de 1-10
        int numeroSecreto = gerador.nextInt(10)+1;

        int numeroAdivinhado;

        //Estrutura de decisao para descobrir o numero
        System.out.println("Qual é o numero secreto? ");
        numeroAdivinhado = ler.nextInt();
        while(numeroAdivinhado != numeroSecreto){
            System.out.println("Errrou!!");
            System.out.println("Qual é o numero secreto? ");
            numeroAdivinhado = ler.nextInt();
        }
        System.out.println("Parabens! Voce dencobriu o meu numero secreto");

        ler.close();

    }
}
