package atividadezinha;
import java.util.Scanner;
import java.util.ArrayList;

public class Questão6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int num;
        System.out.print("Insira um valor para a lista: ");
        for(int i = 0; i < 5; i++){
            num = Integer.parseInt(scan.nextLine());
            lista.add(num);
        }
        System.out.print("Diga o valor a ser verificado dentro da lista: ");
        int question = Integer.parseInt(scan.nextLine());
        if(lista.contains(question)){
            System.out.println("O valor desejado está na posição "+lista.indexOf(question)+" da lista."); 
        } else{
            System.out.println("O valor inserido não existe na lista.");
        }
        scan.close();
    }
}
