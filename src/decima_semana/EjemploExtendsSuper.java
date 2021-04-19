package decima_semana;

import java.util.ArrayList;
import java.util.List;

public class EjemploExtendsSuper {

    public static void main(String[] args) {
        List<? extends Number> foo = new ArrayList<Number>();

        List<? extends Number> foo2 = new ArrayList<Integer>();

        List<? extends Number> foo3 = new ArrayList<Double>();

        List<? super Integer> foo4 = new ArrayList<Integer>();

        List<? super Integer> foo5 = new ArrayList<Number>();

        List<? super Integer> foo6 = new ArrayList<Object>();


    }
}
