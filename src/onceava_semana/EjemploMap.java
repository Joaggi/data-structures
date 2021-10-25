package once_semana;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();

        stringIntegerHashMap.put("Alejandro", 29);
        stringIntegerHashMap.put("Pepe", 16);
        stringIntegerHashMap.put("Luis", 55);
        stringIntegerHashMap.put("Jose", 85);

        System.out.println(stringIntegerHashMap.keySet());
        System.out.println(stringIntegerHashMap.values());

        System.out.println("Edad de Pepe:" + stringIntegerHashMap.get("Pepe"));

        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerHashMap.entrySet()) {
            System.out.println(stringIntegerEntry);
            System.out.println(stringIntegerEntry.getKey());
            System.out.println(stringIntegerEntry.getValue());
        }

        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();

        integerIntegerHashMap.put(1, 29);
        integerIntegerHashMap.put(2, 16);
        integerIntegerHashMap.put(3, 55);
        integerIntegerHashMap.put(4, 85);

        System.out.println(integerIntegerHashMap.keySet());
        System.out.println(integerIntegerHashMap.values());

        System.out.println("Edad de Pepe:" + integerIntegerHashMap.get(2));

        for (Map.Entry<Integer, Integer> integerEntry : integerIntegerHashMap.entrySet()) {
            System.out.println(integerEntry);
            System.out.println(integerEntry.getKey());
            System.out.println(integerEntry.getValue());
        }

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        objectObjectHashMap.put(1, 29);
        objectObjectHashMap.put(2, 16);
        objectObjectHashMap.put(3, 55);
        objectObjectHashMap.put(4, 85);
        objectObjectHashMap.put("Jose", 85);

        System.out.println(objectObjectHashMap.keySet());
        System.out.println(objectObjectHashMap.values());

        System.out.println("Edad de Jose:" + objectObjectHashMap.get("Jose"));
        System.out.println("Edad de 2:" + objectObjectHashMap.get(2));

        for (Map.Entry<Object, Object> objectObjectEntry : objectObjectHashMap.entrySet()) {
            System.out.println(objectObjectEntry);
            System.out.println(objectObjectEntry.getKey());
            System.out.println(objectObjectEntry.getValue());
        }

        HashSet<Integer> hashSet1 = new HashSet<>();

        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);
        hashSet1.add(6);

        System.out.println(hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<>();

        hashSet2.add(3);
        hashSet2.add(4);

        hashSet1.removeAll(hashSet2);

        System.out.println(hashSet1);


    }
}
