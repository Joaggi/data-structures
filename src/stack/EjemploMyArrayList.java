package stack;

public class EjemploMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();

        int variableEntera = 4;
        myArrayList.setElemento(variableEntera);


        Stack<Integer> stackEntera = new Stack<>();
        stackEntera.setElemento(20);
        stackEntera.metodo1();
    }
}
