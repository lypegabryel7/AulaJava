package exercicioaulatres;

public class Gato extends Animal{
    public String pular;

    public Gato(String som, String pular) {
        this.som = som;
        this.pular = pular;
    }

    public String getPular() { return pular; }
    public void setPular(String pular) { this.pular = pular;}
}
