package Exemplo2;

public class Principal {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.nome = "Godizila";
        empresa.departamento.nome = "Desenvimento";

        System.out.println("Nome: " + empresa.departamento.nome);

    }
}
