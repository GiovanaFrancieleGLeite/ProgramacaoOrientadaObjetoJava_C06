package Exercicio05;

public class Arma {
    String nome;
    int poder;
    int resistenacia;
    String descricao;

    void mostrarIndoArma(){
        System.out.println("Informaçoes da Arma: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Resistenacia: " + resistenacia);
        System.out.println("Descricao: " + descricao);
    }
}
