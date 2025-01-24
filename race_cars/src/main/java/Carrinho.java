public class Carrinho {

    String cor;
    Piloto piloto;
    Motor motor;

    public Carrinho(String cor,String modelo, int velocidadeMaxima){
        this.cor = cor;
        this.motor = new Motor();
        this.motor.velocidadeMaxima = velocidadeMaxima;
        this.motor.modelo = modelo;
    }


    void mostraInfo(){
        piloto.mostraInfo();
        System.out.println("Cor do carro: "+cor);
        motor.mostraInfo();
    }

}
