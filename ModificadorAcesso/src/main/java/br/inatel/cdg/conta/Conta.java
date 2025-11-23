package br.inatel.cdg.conta;

import br.inatel.cdg.cliente.Cliente;

public class Conta {
    private int  numero;
    private float saldo;
    private float limite;
    Cliente []cliente;

    public Conta() {
        cliente = new Cliente[3];
    }

    public void sacar(float quantia){
        if(quantia <= saldo){
            saldo -= quantia;
            System.out.println("Sucesso ao sacar");
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(float quantia){
        saldo += quantia; // Supondo que a conta nao esteja no negativo
        System.out.println("O dinheiro foi depositado com sucesso");
    }

    // GET - Mostrar o valor que a variavel esta armazenando (print)
    public float getSaldo() {
        return saldo;
    }
    public float getLimite() {
        return limite;
    }
    public int getNumero() {
        return numero;
    }

    //SET - Declarar um valor para a variavel (entrada)
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }
}
