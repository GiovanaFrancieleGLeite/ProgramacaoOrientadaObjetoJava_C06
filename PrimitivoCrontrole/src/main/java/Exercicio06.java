import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
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
            if(numeroSecreto > numeroAdivinhado){
                System.out.println("Errrou! O numero é maior!");
            }
            else{
                System.out.println("Errrou! O numero é menor!");
            }

            System.out.println("Qual é o numero secreto? ");
            numeroAdivinhado = ler.nextInt();
        }
        System.out.println("Parabens! Voce dencobriu o meu numero secreto");

        ler.close();

    }
}
