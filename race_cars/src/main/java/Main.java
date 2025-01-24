import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Corrida corrida = new Corrida();
        corrida.local = "Interlagos";
        corrida.data = "13/03/2022";
        int op = 0;
        do {
            System.out.println("Menu da corrida:");
            System.out.println("Insira 1 para adicionar um participante");
            System.out.println("Insira 2 para ver informações da corrida");
            System.out.println("Insira 3 para contar o número de pilotos de cada equipe");
            System.out.println("Insira 4 para sair");
            op = sc.nextInt();
            switch (op) {
                case (1):

                    String nome;
                    String equipe;
                    System.out.println("Entre com o nome do piloto:");

                    nome = sc.next();
                    System.out.println("Entre com a equipe do piloto:");
                    equipe = sc.next();
                    Piloto piloto = new Piloto(nome, equipe);

                    String cor;
                    String modelo;
                    int velocidadeMaxima;

                    System.out.println("Entre com a cor do carro:");
                    cor = sc.next();
                    System.out.println("Entre com o modelo do motor do carro:");
                    modelo = sc.next();
                    System.out.println("Entre com a velocidade maxima do carro:");
                    velocidadeMaxima = sc.nextInt();

                    Carrinho carro = new Carrinho(cor, modelo, velocidadeMaxima);
                    carro.piloto = piloto;

                    corrida.adicionarParticipante(carro);

                    break;
                case (2):
                    corrida.mostraInfo();
                    break;
                case (3):
                    corrida.contarEquipes();
                    break;
                case (4):
                    corrida.iniciar();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(op != 4);
    }

}
