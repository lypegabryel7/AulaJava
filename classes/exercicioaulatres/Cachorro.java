package exercicioaulatres;

public class Cachorro extends Animal{
    public String correr;

    public Cachorro(String som, String correr) {
        this.som = som;
        this. correr = correr;
    }

    public String getAction() {return correr; }
    public void setCorrer(String correr) { this.correr = correr;}
}
