package atividadezinha;
import java.util.Scanner;
import java.util.ArrayList;
public class Questão7 {
    public static void main(String[] args) {
        ArrayList<String> listaAlunos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String nome;
        System.out.println("Lista de alunos:");
        for(int i = 0; i < 10; i++){
            nome = scan.nextLine();
            listaAlunos.add(nome);  
        }
        System.out.println(listaAlunos);
        System.out.print("Qual aluno deseja verficar?: ");
        String nomedeAluno = scan.nextLine();
        if(listaAlunos.contains(nomedeAluno)){
            System.out.println("O nome "+nomedeAluno+" está na lista.");
        } else{
            System.out.println("O aluno solicitado nãoe se encontra na lista.");
        }
    }
}
