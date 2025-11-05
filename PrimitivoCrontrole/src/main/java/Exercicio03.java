import java.util.Scanner;

public class Exercicio03 {
    static void main(String[] args) {
        //O valor de entra do valor de NPA
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a nota de NPA: ");
        float NPA = entrada.nextFloat();

        // Estrura de decisao para saber se ele passou sim ou nao
        if (NPA >= 60) {
            System.out.println("Parabens! Voce foi aprovado!");
        }
        else{
            System.out.println("Voce tera que fazer NP3");

            System.out.println("Informe a nota de NP3: ");
            float NP3 = entrada.nextFloat();

            if ((NP3+NPA)/2 >= 50) {
                System.out.println("Parabens! Voce foi aprovado!");
            }
            else {
                System.out.println("Voce foi reprovado!");
            }
        }

        entrada.close();
    }
}
