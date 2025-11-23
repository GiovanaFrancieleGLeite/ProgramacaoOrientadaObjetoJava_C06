package Exemplo1;

public class Conta {

    int numero;
    float saldo;
    float limite;
    Cliente titular;

    void depositar(float quantia){
        saldo = saldo + quantia;
    }

    void sacar(float quantia){
        saldo = saldo - quantia;
    }

    void transferir(Conta contaDestino, float quantia){
        saldo = saldo - quantia;
        contaDestino.saldo += quantia;
    }

}

