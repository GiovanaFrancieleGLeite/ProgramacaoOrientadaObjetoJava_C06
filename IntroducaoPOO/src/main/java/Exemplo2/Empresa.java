package Exemplo2;

public class Empresa {
    String nome;
    Departamento departamento;

    /*
    Costrutor
    Assim que é criada a empresa, ela ja cria o departamento
     */

    public Empresa() {
        departamento = new Departamento();
    }

    void imprimirNome() {
        System.out.println("Nome da empresa: " + nome);
    }
}
