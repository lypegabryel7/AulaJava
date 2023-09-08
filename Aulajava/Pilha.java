package Aulajava;
import java.util.Stack;

class PilhaJava{
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<String>();
        pilha.push("Estrutura");
        pilha.push("de");
        pilha.push("dados");
        System.out.println("Pilha: " + pilha);
        System.out.println("Tamanho: " + pilha.size());
        pilha.pop();
        System.out.println("Pilha após a remoção: " + pilha);
    }
}