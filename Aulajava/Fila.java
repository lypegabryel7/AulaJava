package Aulajava;
import java.util.Queue;
import java.util.LinkedList;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
    fila.add("um");
    fila.add("dois");
    fila.add("três");
    fila.add("quatro");
    fila.clear();
    System.out.println("A fila possui: " + fila);
}
}
