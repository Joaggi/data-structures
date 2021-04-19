package septima_semana;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistVsLinkedList {
    public static void main(String[] args) {
        long numeroDeInserciones = 100000000L;
        makeList1(new ArrayList<>(), numeroDeInserciones);
        makeList1(new LinkedList<>(), numeroDeInserciones);

//        makeList2(new ArrayList<>(), 100000);
//        makeList2(new LinkedList<>(), 100000);
    }

    public static void makeList1(List<Integer> lst, long N){
        long tiempoZero = System.nanoTime();

        lst.clear();
        for (int i = 0; i < N; i++) {
            lst.add(i);
        }

        long tiempoFinal = System.nanoTime();

        System.out.println("Type: " + lst.getClass().toString() + " Add final: " + (tiempoFinal - tiempoZero)/ Math.pow(10, 9) );
    }

    public static void makeList2(List<Integer> lst, long N){
        long tiempoZero = System.nanoTime();

        lst.clear();
        for (int i = 0; i < N; i++) {
            lst.add(0, i);
        }

        long tiempoFinal = System.nanoTime();

        System.out.println("Type: " + lst.getClass().toString() + "Add begin: " + (tiempoFinal - tiempoZero)/ Math.pow(10, 9));
    }



}