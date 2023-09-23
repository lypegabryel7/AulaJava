import java.util.*;
public class Bubble {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(30);
        list.add(154);
        list.add(78);
        list.add(5);
        
        System.out.println("Antes da ordenação: "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Depois da ordenação: "+list);
        
    }
}