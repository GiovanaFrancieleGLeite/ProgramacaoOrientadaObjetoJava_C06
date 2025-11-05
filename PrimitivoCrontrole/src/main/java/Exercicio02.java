import java.util.Scanner;  // Ler e interpretar a entrada de dado

public class Exercicio02 {
    static void main(String[] args) {

        //Criar um scanner para ler as entradas
        Scanner entrada = new Scanner(System.in);

        // As variaveis que irao salvas a quantidade de lancheas a cada 1 hora
        int primeiro, segundo, terceiro;

        System.out.println("O numero de lanches consumidos na primeiro hora: ");
        primeiro = entrada.nextInt();
        System.out.println("O numero de lanches consumidos na segundo hora: ");
        segundo = entrada.nextInt();
        System.out.println("O numero de lanches consumidos na terceiro hora: ");
        terceiro = entrada.nextInt();
        
        // Calculando o Total e a media
        int total = primeiro + segundo + terceiro;
        float media = (float) total / 3;

        // Mostrar o resultado
        System.out.println("O valor TOTAL dos lanches: " + total);
        System.out.println("O valor MEDIA: " + media);

        // Fechar o scanner
        entrada.close();

    }
}
