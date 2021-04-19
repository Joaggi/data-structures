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
        Arbol<String> arbolHijoIzquierdoB =
                new Arbol<>("B");

        arbolInicial.hijoIzquierdo = arbolHijoIzquierdoB;


        Arbol<String> arbolHermanoDerechoC =
                new Arbol<>("C");

        arbolHijoIzquierdoB.hermanoDerecho = arbolHermanoDerechoC;
    }
}
