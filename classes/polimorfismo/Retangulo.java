package polimorfismoexer;

public class Retangulo extends FormasGeometricas {
    public Float largura;
    public void setLargura(Float largura){
        this.largura = largura;
    }
    @Override
    public void calcularArea(){
        System.out.println(largura*largura);
    }
 }
