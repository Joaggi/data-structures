package stack;

import java.util.Arrays;

public class StackArray {
    int[] arreglo;
    int k=-1;

    StackArray(int tamanno){
        arreglo = new int[tamanno];
    }

    public int push(int nuevoElemento){
        k = k+1;
        arreglo[k] = nuevoElemento;
        return k;
    }

    public int pop(){
        int numeroARetornar = arreglo[k];
        arreglo[k] = 0;
        k = k-1;
        return numeroARetornar;
    }

    public int peek() {
        return arreglo[k];
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(10);
        stackArray.push(5);
        System.out.println(Arrays.toString(stackArray.arreglo));
        stackArray.push(7);
        System.out.println(Arrays.toString(stackArray.arreglo));
        System.out.println(stackArray.pop());
        System.out.println(Arrays.toString(stackArray.arreglo));

    }
}
