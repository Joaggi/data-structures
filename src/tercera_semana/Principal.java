package tercera_semana;


import java.util.Collection;

public class Principal {
    public static void main(String[] args) {
        LinkedList<Integer> nodoInicial = new LinkedList<>(3);
        LinkedList<Integer> nodoDos = new LinkedList<>(10);
        nodoInicial.nodoSiguiente = nodoDos;
        LinkedList<Integer> nodoTres = new LinkedList<>(67);
        nodoDos.nodoSiguiente = nodoTres;
        LinkedList<Integer> nodoCuatro = new LinkedList<>(23);
        nodoTres.nodoSiguiente = nodoCuatro;

        imprimirLista(nodoInicial);

        System.out.println(nodoInicial.buscar(23));

//        nodoInicial.nodoSiguiente = null;
//
//        nodoTransitorio = nodoInicial;
//        System.out.println(nodoTransitorio.dato);
//        while(nodoTransitorio.nodoSiguiente != null){
//            nodoTransitorio = nodoTransitorio.nodoSiguiente;
//            System.out.println(nodoTransitorio.dato);
//        }
//
        nodoDos.nodoSiguiente = nodoCuatro;

        imprimirLista(nodoInicial);


        LinkedList<Integer> nodoIntermedio = new LinkedList<>(99);
        LinkedList<Integer> auxiliar = nodoDos.nodoSiguiente;
        nodoDos.nodoSiguiente = nodoIntermedio;
        nodoIntermedio.nodoSiguiente = auxiliar;

        imprimirLista(nodoInicial);

        //java.util.LinkedList
    }

    private static void imprimirLista(LinkedList<Integer> nodoInicial) {
        System.out.println("------------------------------------");
        LinkedList<Integer> nodoTransitorio;
        nodoTransitorio = nodoInicial;
        System.out.println(nodoTransitorio.dato);
        while(nodoTransitorio.nodoSiguiente != null){
            nodoTransitorio = nodoTransitorio.nodoSiguiente;
            System.out.println(nodoTransitorio.dato);
        }
    }



}
