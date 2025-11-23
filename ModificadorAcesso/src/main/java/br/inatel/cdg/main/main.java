package br.inatel.cdg.main;

import br.inatel.cdg.cliente.Cliente;
import br.inatel.cdg.conta.Conta;

public class main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Tessa");
        cliente1.setCPF(1234567);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Jaimes");
        cliente2.setCPF(987654);

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Will");
        cliente3.setCPF(1784567);


        Cliente clientes[] = new Cliente[3];
        clientes[0] = cliente1;
        clientes[1] = cliente2;
        clientes[2] = cliente3;

        Conta conta = new Conta();
        conta.setCliente(clientes);
        conta.setLimite(500);
        conta.setNumero(12345);

        conta.depositar(700);
        System.out.println("Saldo: R$ " + conta.getSaldo());
        conta.sacar(200);
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}
