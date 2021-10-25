package tercera_semana;

public class LinkedList <T>{
    LinkedList<T> nodoSiguiente; // Apuntador de memoria al siguiente nodo
    T dato; // Dato en sí.

    public LinkedList(T dato) {
        this.dato = dato;
    }

    public boolean buscar(T datoABuscar){
        if(dato.equals(datoABuscar)){
            return true;
        }
        else if(nodoSiguiente == null){
            return  false;
        }
        else
            return nodoSiguiente.buscar(datoABuscar);
    }
}
