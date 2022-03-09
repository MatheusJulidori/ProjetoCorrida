import java.util.Random;

public class Corrida {

    String local;
    String data;
    Carrinho[] participantes;

    public Corrida(){
        participantes = new Carrinho[6];
    }

    void adicionarParticipante(Carrinho participante){

        for (int i =0;i<participantes.length;i++){
            if(participantes[i] == null){
                participantes[i] = participante;
                break;
            }
        }
    }

    void contarEquipes(){
        int wil=0;
        int mer=0;
        int red=0;

        for (Carrinho participante : participantes) {
            if (participante != null) {
                if (participante.piloto.equipe.equals("Williams")) wil++;
                else if (participante.piloto.equipe.equals("Red Bull")) red++;
                else mer++;
            }
        }

        System.out.println("Pilotos da Williams: "+wil);
        System.out.println("Pilotos da Red Bull: "+red);
        System.out.println("Pilotos da Mercedes: "+mer);
    }

    void iniciar(){
        System.out.println("Corrida iniciada");
        System.out.println();
        System.out.println("Corrida finalizada");
        anunciarGanhador();
    }

    void anunciarGanhador(){
        int numeroDeParticipantes = 0;
        for (Carrinho participante : participantes) {
            if (participante != null) {
                numeroDeParticipantes++;
            }
        }

        Random random = new Random();
        int ganhador = random.nextInt(numeroDeParticipantes);
        System.out.println("O ganhador foi o corredor "+ participantes[ganhador].piloto.nome);
    }

    void mostraInfo(){
        System.out.println("Local da corrida: "+local);
        System.out.println("Data da corrida: "+data);
        System.out.println("Particpantes: ");
        for (Carrinho participante : participantes) {
            if (participante != null) {
                participante.mostraInfo();
            }
        }
    }

}
