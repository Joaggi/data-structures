package cuarta_semana;

import java.util.LinkedList;

public class ejemplo_linkedlist {

    public static void main(String[] args) {
        long tiempoZero = System.nanoTime();
        LinkedList<String> ll = new LinkedList<>();
        System.out.println(ll.size());
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");

        System.out.println(ll);

        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Contenido original: " + ll);

        ll.remove("F");
        ll.remove(2);
        System.out.println("Contenido después de borrar: " + ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println("Después de borrar el primero y el último: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " modificada");
        System.out.println("Después del cambio: " + ll);

        for(String i: ll){ // Recorrer la lista usando el iterador
            System.out.print(i+";");
        }

        long tiempoFinal = System.nanoTime();

        System.out.println((tiempoFinal - tiempoZero)* Math.pow(10, 9));

        ll.removeFirst();
        ll.removeLast();
        System.out.println("Después de borrar el primero y el último: " + ll);

    }
}
