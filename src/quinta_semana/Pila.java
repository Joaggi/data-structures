package quinta_semana;

import java.util.LinkedList;

public class Pila<T> {
    LinkedList<T> linkedList;

    public Pila() {
        linkedList = new LinkedList<>();
    }

    void add(T elemento){
        linkedList.add(elemento);
    }
}
