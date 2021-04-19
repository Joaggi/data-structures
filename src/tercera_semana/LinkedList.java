package tercera_semana;

public class LinkedList <T>{
    LinkedList<T> nodoSiguiente;
    T dato;

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
