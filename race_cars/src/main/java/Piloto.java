

public class Piloto {

    String nome;
    String equipe;

    public Piloto(String nome, String equipe){
        this.nome = nome;
        this.equipe = equipe;
    }

    void darEntrevista(){
        System.out.println("Ganhei");
    }

    void mostraInfo(){
        System.out.println("Piloto: "+nome);
        System.out.println("Equipe: "+equipe);
    }

}
