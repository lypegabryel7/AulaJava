package polimorfismoexer;

public class Circulo extends FormasGeometricas {
    public Float raio;

    public void setraio(Float raio){ this.raio = raio; }
    @Override
    public void calcularArea(){
        float pi = 3.14f;
        System.out.println(pi*raio*raio);
    }
}
