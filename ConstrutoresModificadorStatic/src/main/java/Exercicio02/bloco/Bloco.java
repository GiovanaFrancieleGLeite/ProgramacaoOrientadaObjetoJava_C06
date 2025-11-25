package Exercicio02.bloco;

public class Bloco {
    private static int NumeroBloco = 0;
    private static int NumeroBlcooDestruido = 0;
    private static int NumeroBlocoCriado = 0;

    public  Bloco() {
        NumeroBloco++;
        NumeroBlocoCriado++;
    }

    public int Destruido(){
        System.out.println("Destruindo o bloco");
        if(NumeroBloco > 0){
            NumeroBloco--;
            NumeroBlcooDestruido++;
        }
        return 0;
    }

    public static int getNumeroBloco() {
        return NumeroBloco;
    }

    public static int getNumeroBlcooDestruido() {
        return NumeroBlcooDestruido;
    }

    public static int getNumeroBlocoCriado() {
        return NumeroBlocoCriado;
    }
}
