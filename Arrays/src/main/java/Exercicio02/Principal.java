package Exercicio02;

public class Principal {
    public static void main(String[] args) { 
        //Banda
        Banda banda = new Banda("The Score", "Rock");

        //Empresario
        Empresario empresario = new Empresario("Jaimes", "12 123 456 789 - 98");

        banda.empresario = empresario;

        //Membros
        Membro membro1 = new Membro();
        membro1.setNome("Paulo");
        membro1.setFuncao("Guitarra");
        Membro membro2 = new Membro();
        membro2.setNome("Juan");
        membro2.setFuncao("Bateria");
        Membro membro3 = new Membro();
        membro3.setNome("Maria");
        membro3.setFuncao("Baixo");

        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);
        banda.addMembroNovo(membro3);

        //Musica
        Musica musica1 = new Musica("Rush",2.26);
        Musica musica2 = new Musica("Stronger",3.10);
        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);

        //Mostrar as informacoes
        banda.mostrarInfo();
    }
}