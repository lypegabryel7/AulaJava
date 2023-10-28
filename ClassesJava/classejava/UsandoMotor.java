package classejava;
import java.util.Scanner;

public class UsandoMotor {
    public static void main(String[] args) {
        Motor m1 = new Motor();
        Scanner scan = new Scanner(System.in);
        System.out.print("informe a velocidade máxima: ");
        m1.velocidadeMaxima = Float.parseFloat(scan.nextLine());
        System.out.print("Fab: ");
        m1.fabricante = scan.nextLine();
        System.out.print("Informe a voltagem: ");
        m1.voltagem = Integer.parseInt(scan.nextLine());
        System.out.print("Por último, informe a potência: ");
        m1.potencia = Integer.parseInt(scan.nextLine());
        
        System.out.println("A velocidade máxima do motor é: "+m1.velocidadeMaxima+"\nO fabricante é: "+m1.fabricante+"\nA voltagem é: "+m1.voltagem+"\nA potência é: "+m1.potencia);

        scan.close();
    }
}
