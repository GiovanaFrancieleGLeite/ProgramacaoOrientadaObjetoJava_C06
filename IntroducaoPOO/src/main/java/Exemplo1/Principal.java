package Exemplo1;

public class Principal {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 100;
        conta1.limite = 700;
        conta1.numero = 123;

        Cliente cliente = new Cliente();
        cliente.nome = "Pedro";
        cliente.cpf = "123.456.789-00";

        // Aconteceu a associacao
        conta1.titular = cliente;

        //Duas referencias para o mesmo local
        System.out.println(cliente.nome);
        System.out.println(conta1.titular.nome);
    }
}
