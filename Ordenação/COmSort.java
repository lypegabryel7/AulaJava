import java.util.ArrayList;

public class COmSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(50);
        list.add(20);
        list.add(15);
        System.out.println(list);
        for(int i = 0; i < 4; i++) {
        if(list.get(0) > list.get(1)) {
            int aux = list.get(0);
            list.set(0, list.get(1));
            list.set(1,aux);
        }
        if(list.get(1) > list.get(2)) {
            int aux = list.get(1);
            list.set(1, list.get(2));
            list.set(2,aux);
        }
        if(list.get(0) > list.get(2)) {
            int aux = list.get(0);
            list.set(0, list.get(2));
            list.set(2,aux);
        }
        list.get((0)+1);
        
        
        }
        System.out.println(list);
    }
}

