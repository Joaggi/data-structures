package cuarta_semana;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Insertar {
    public static void main(String[] args) {
        int [] arr = new int [10]; // crear arreglo con 10 posiciones
        arr[0] = 45;
        arr[1] = 35;
        arr[2] = 435;
        arr[3] = 455;
        arr[4] = 245;
        arr[5] = 5645;
        arr[6] = 435;
        arr[7] = 4532;
        arr[8] = 4564;
        arr[9] = 4543;

        for(int i=0; i<10; i++)
            System.out.println(arr[i]);

        int [] newArr = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        for(int i=0; i<10; i++)
            System.out.println(newArr[i]);

        for(int i=0; i<10; i++)
            System.out.println(arr[i]);


        for(int variableEntero: arr){
            System.out.println(variableEntero);
        }


        Object [] arregloDeObjectos = new Object [10]; // crear arreglo con 10 posiciones

        arregloDeObjectos[0] = arr;

        for(Object objetoDentroDeArreglo: arregloDeObjectos){
            for(int variableEntero: (int[]) objetoDentroDeArreglo){
                System.out.println(variableEntero);
            }
        }

    }
}

