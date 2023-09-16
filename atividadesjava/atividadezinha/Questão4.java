package atividadezinha;
//Crie um programa que ache o elemento do meio da lista
import java.util.Scanner;
import java.util.ArrayList;
public class Questão4 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira sete nomes abaixo:");
        String nome;
        for(int i = 0; i < 7; i++){
            nome = scan.nextLine();
            lista.add(nome);  
        }
        int num = lista.size()/2;
        if (num % 2 == 0){
            System.out.println("os elementos do meio são: "+lista.get(num)+ lista.get(num+1));
        } else {
            System.out.println("O elemento do meio é: "+lista.get(num)); 
        }
        scan.close();

    }
}
