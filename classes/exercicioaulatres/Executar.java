package exercicioaulatres;

public class Executar {
    public static void main(String[] args) {
    Gato meuGato = new Gato("Miau!", "*pula*");
    Cachorro meuCachorro = new Cachorro("Au Au!", "*Corre*");

    System.out.println("O gato "+meuGato.getPular()+" e faz "+meuGato.emitirSom());
    System.out.println("O cachorro "+meuCachorro.getAction()+" e faz "+meuCachorro.emitirSom());
    }
}
