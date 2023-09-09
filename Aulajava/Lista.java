package Aulajava;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int num = -1;
        while(num != 0) {
            System.out.print("digite um número: ");
            num = Integer.parseInt(scan.nextLine());
            if (num != 0){
                lista.add(num);
            }
        }
        System.out.println("Aqui está sua lista: "+lista);
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        scan.close();
    }
}
