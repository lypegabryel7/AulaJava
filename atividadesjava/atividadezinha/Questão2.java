package atividadezinha;
/*Crie um programa que receba quatro valores do usuário, coloque em uma lista e depois remova todos os elementos
na sequência partindo do primeiro elemento da lista, e por fim verifique se a lista ficou vazia*/
import java.util.ArrayList;
import java.util.Scanner;
public class Questão2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int num = 1;

        for(int i = 0; i < 4; i++){
            System.out.print("Insira um valor: ");
            num = Integer.parseInt(scan.nextLine());
            lista.add(num);
            System.out.println(lista);  
        }
        for (int i = 0; i < 4; i++){
            lista.remove(0);
        }
        if(lista.isEmpty()){
            System.out.println("A lista está vazia");
        }else{
            System.out.println("A lista não está vazia");
        }
        scan.close();
    }
        
    }    
