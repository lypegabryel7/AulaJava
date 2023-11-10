package aulaestruturada;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercícios {
    public static void main(String[] args) {
        /*Pilhas são elementos onde se tem base a partir do último elemento adicionado, sendo possível alterar, adicionar e remover.
         diferente de Filas, onde o elemento a ser alterado é o primeiro que foi adicionado.
         E listas abrangem uma variedade maior, sendo possível adicionar, remover e alterar elementos de qualquer posição.
          */
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

