package Exercicio02;

public class Banda {
    private String nome;
    private String genero;
    Empresario empresario;
    Membro membro[] = new Membro[3];
    Musica musica[] = new Musica[2];

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void mostrarInfo(){
        // Mostrar informacao da banda
        System.out.println("Nome da banda: " + nome);
        System.out.println("Genero da banda: " + genero);

        // Mostrar o empresario
        if (this.empresario != null) {
            System.out.println("\nO empresario da banda é : " + this.empresario.getNome() + " que possui o CNPJ " + this.empresario.getCnpj());
        } else {
            System.out.println("\nEmpresário: Não cadastrado (É preciso atribuir um objeto Empresario).");
        }

        // Mostrar os membros
        System.out.println("\nOs membros da banda são:");
        for(Membro m : membro){
            if (m != null) {
                System.out.println("Nome: " + m.getNome() + " - Funcao: " + m.getFuncao());
            }
        }

        // Mostrar as musicas
        System.out.println("\nAs músicas da banda são:");
        for (Musica msc : musica){
            if (msc != null) {
                System.out.println("A música:  " + msc.getNome() + " e o seu tempo de duração é: " + msc.getDuracao());
            }
        }
    }

    public void addMusicaNova(Musica novaMusica){
        for(int i = 0; i < this.musica.length; i++){
            if(this.musica[i] == null){
                this.musica[i] = novaMusica;
                break;
            }
        }
    }

    public void addMembroNovo(Membro novoMembro){
        for(int j = 0; j < this.membro.length; j++){
            if(this.membro[j] == null){
                this.membro[j] = novoMembro;
                break;
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}