import java.util.Scanner;

public class Exercicio04 {
    static void main() {

        //A entrada da quantidade de alunos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos matriculados na materia C06: ");
        int alunos = entrada.nextInt();

        switch (alunos) {
            case 10:
            case 20:
                System.out.println("O curso deve ser ministrado na sala I-16");
                break;
            case 30:
                System.out.println("O curso deve ser ministrado na sala I-22");
                break;
            default:
                System.out.println("Nao tem sala disponivel");
                break;
        }

        entrada.close();
    }
}
