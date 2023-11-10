package classes.classegundaaula.retangulo;

class ClassesGeral {
    Float largura;  
    Float altura;  

    public ClassesGeral(float l, float a){
        largura = l;
        altura = a;
    }
    void calcularArea(){
        System.out.println("A área é: "+altura*largura);
    }
    void calcularPerimetro(){
        System.out.println("O perímetro é: "+(2*(largura+altura)));
    }
}

