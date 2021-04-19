package stack;

public class Stack<T> extends MyArrayList<T>{
    public void metodo1(){
        T elemento = super.getElemento();

        System.out.println(elemento);
    }
}
