package polimorfismoexer;
import java.util.Scanner;

public class executar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circulo redondo = new Circulo();
        Retangulo retangular = new Retangulo();

        System.out.print("Digite o raio do círculo: "); redondo.setraio(scan.nextFloat());
        System.out.print("Agora digite a largura do Retângulo: "); retangular.setLargura(scan.nextFloat());
        
        redondo.calcularArea();
        retangular.calcularArea();

        scan.close();        
    }
}
