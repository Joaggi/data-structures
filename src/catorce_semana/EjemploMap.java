package catorce_semana;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class EjemploMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Coca-cola", 5);
        treeMap.put("Coca-cola", 7);
        treeMap.put("Coca-cola", treeMap.get("Coca-cola")+ 8);
        treeMap.put("Leche", 5);
        treeMap.put("Papas", 8);

        System.out.println("Contiene coca-cola: " + treeMap.containsKey("Coca-cola"));
        System.out.println("Contiene Yuca: " + treeMap.containsKey("Yuca"));

        System.out.println(treeMap);

        System.out.println("Llave=valor");
        for (java.util.Map.Entry<String, Integer> entry: treeMap.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("Llave");
        for (String entry: treeMap.keySet()) {
            System.out.println(entry);
        }

        System.out.println("Valor");
        for (Integer entry: treeMap.values()) {
            System.out.println(entry);
        }

    }
}
