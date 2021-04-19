package cuarta_semana;

import java.util.ArrayList;

public class ejemplo_arraylist {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Tamaño inicial: " + al.size());
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");

        al.add(1, "A2");
        for(String i: al){
            System.out.print(i+"; \n");
        }
        System.out.println("Tamaño después de insertar: " + al.size());
        System.out.println("Contenido: " + al);

        al.remove("F");
        al.remove(2);
        System.out.println("Tamaño después de eliminar: " + al.size());
        System.out.println("Contenido: " + al);



        for(String i: al){
            System.out.print(i+"; ");
        }

    }

}
