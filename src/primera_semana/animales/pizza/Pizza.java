package primera_semana.animales.pizza;

import java.util.ArrayList;

public interface Pizza<T extends Ingredientes> {
    ArrayList<String> hacerPizza();
}
