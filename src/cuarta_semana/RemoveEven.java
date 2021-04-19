package cuarta_semana;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveEven {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        sum(arrayList);

        LinkedList<Integer> arrayLinkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            arrayLinkedList.add(i);
        }

        sum(arrayLinkedList);
    }

    public static void sum(List<Integer> lst){
        long tiempoZero = System.nanoTime();

        int i = 0;

        while(i < lst.size()){
            if( lst.get(i) % 2 == 0){
                lst.remove(i);
            }
            else{
                i++;
            }
        }

        long tiempoFinal = System.nanoTime();

        System.out.println("Type: " + lst.getClass().toString() + " Add final: " + (tiempoFinal - tiempoZero)/ Math.pow(10, 9));
    }
}
