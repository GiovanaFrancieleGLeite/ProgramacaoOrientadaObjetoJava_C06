package Exercicio01;

public class Cantina {
    String nome;
    Salgado salgado[] = new Salgado[3];  //Iniciando a array  -- Irao ser criados na mesma instancia

    void addSalgado (Salgado novoSalgado){
        for  (int i = 0; i < this.salgado.length; i++){ // Utilizando o FOR convencional
            if (this.salgado[i] == null){  // Verificando se existente salgado
                this.salgado[i] = novoSalgado;
                break;
            }
        }

    }

    void mostrarInfo(){
        System.out.println("Na cantina " + this.nome + " temos os salgados: ");
        for(Salgado salgado : salgado){  // Utilizando o FOR melhorado  -- (retorno - vetor)
            System.out.println(salgado.nome);

        }
    }
}
