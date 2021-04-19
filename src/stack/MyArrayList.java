package stack;

public class MyArrayList<T>{
    T elemento;

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public void imprimir(){
        System.out.println(elemento);
    }

    public static void main(String[] args) {
        int a = 2;
        System.out.println(a << 2);
    }
}
