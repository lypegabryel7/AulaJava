package classejava;
import java.util.Scanner;

public class UsandoClasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        System.out.print("Insira o nome do usuário: ");
        nome = scan.nextLine();
        Pessoa p1 = new Pessoa(nome);
        p1.altura = 1.86f;
        //sim
        p1.idade = 19;
        System.out.println("O nome utilizado na classe é: "+ p1.mostraNome()+", a idade é: "+p1.idade+" e a altura é: "+p1.altura);
        scan.close();
    }
}
