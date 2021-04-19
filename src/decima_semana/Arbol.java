package decima_semana;

public class Arbol <T>{
    T dato;
    Arbol<T> hijoIzquierdo;
    Arbol<T> hermanoDerecho;

    Arbol(T datoInicial){
        this.dato = datoInicial;
    }

    public static void main(String[] args) {
        Arbol<String> arbolInicial = new Arbol<>("A");

//        Otra forma de definir el árbol.
//        Arbol<String> arbolHijoIzquierdoB =
//                new Arbol<>("B");
//
//        arbolInicial.hijoIzquierdo = arbolHijoIzquierdoB;

        arbolInicial.hijoIzquierdo = new Arbol<>("B");
        arbolInicial.hijoIzquierdo.hermanoDerecho = new Arbol<>("C");;
    }
}
