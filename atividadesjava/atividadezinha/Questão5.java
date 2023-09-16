package atividadezinha;
//Crie um programa que una duas listas
import java.util.Scanner;
import java.util.ArrayList;
public class Questão5 {
    public static void main(String[] args) {
        ArrayList<Integer> primeiraLista = new ArrayList<>();
        ArrayList<Integer> segundaLista = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Crie a primeira lista numérica (pressione 0 para parar): ");
        int num1 = 1;
        int num2 = 1;
        while (num1 != 0){
        num1 = Integer.parseInt(scan.nextLine());
        if(num1 == 0){break;} else{primeiraLista.add(num1);}
        }
        System.out.println("Crie a segunda: ");
        while (num2 != 0){
            num2 = Integer.parseInt(scan.nextLine());
            if(num2 == 0){break;} else{segundaLista.add(num2);}
        }
        System.out.println(primeiraLista);
        System.out.println(segundaLista);

        primeiraLista.addAll(segundaLista);

        System.out.println(primeiraLista);
        scan.close();
    }
}
