package decima_semana;

import java.util.ArrayList;

public class ArbolGeneral<T>{
    T dato;
    ArrayList<ArbolGeneral<T>> hijos;

    ArbolGeneral(T datoInicial){
        this.dato = datoInicial;
    }

    public static void main(String[] args) {
        ArbolGeneral<String> arbolInicial =
                new ArbolGeneral<>("A");

        arbolInicial.hijos =
                new ArrayList<>();

        ArbolGeneral<String> arbolGeneralB =
                new ArbolGeneral<>("B");

        arbolInicial.hijos.add(arbolGeneralB);

        ArbolGeneral<String> arbolGeneralC =
                new ArbolGeneral<>("C");

        arbolInicial.hijos.add(arbolGeneralC);


        ArbolGeneral<String> arbolGeneralD =
                new ArbolGeneral<>("D");

        arbolInicial.hijos.add(arbolGeneralD);


        ArbolGeneral<String> arbolGeneralE =
                new ArbolGeneral<>("E");

        arbolInicial.hijos.add(arbolGeneralE);

        arbolGeneralB.hijos =
                new ArrayList<>();

        ArbolGeneral<String> arbolGeneralF =
                new ArbolGeneral<>("F");

        arbolGeneralB.hijos.add(arbolGeneralF);

        ArbolGeneral<String> arbolGeneralG =
                new ArbolGeneral<>("G");

        arbolGeneralB.hijos.add(arbolGeneralG);



        arbolGeneralD.hijos =
                new ArrayList<>();

        ArbolGeneral<String> arbolGeneralH =
                new ArbolGeneral<>("H");

        arbolGeneralD.hijos.add(arbolGeneralH);

        ArbolGeneral<String> arbolGeneralI =
                new ArbolGeneral<>("I");

        arbolGeneralD.hijos.add(arbolGeneralI);




        arbolGeneralE.hijos =
                new ArrayList<>();

        ArbolGeneral<String> arbolGeneralJ =
                new ArbolGeneral<>("J");

        arbolGeneralE.hijos.add(arbolGeneralJ);

        ArbolGeneral<String> arbolGeneralK =
                new ArbolGeneral<>("K");

        arbolGeneralE.hijos.add(arbolGeneralK);



        arbolGeneralK.hijos =
                new ArrayList<>();

        ArbolGeneral<String> arbolGeneralL =
                new ArbolGeneral<>("L");

        arbolGeneralK.hijos.add(arbolGeneralL);

        ArbolGeneral<String> arbolGeneralM =
                new ArbolGeneral<>("M");

        arbolGeneralK.hijos.add(arbolGeneralM);




        arbolGeneralL.hijos =
                new ArrayList<>();

        ArbolGeneral<String> arbolGeneralN =
                new ArbolGeneral<>("N");

        arbolGeneralL.hijos.add(arbolGeneralN);




        arbolGeneralM.hijos =
                new ArrayList<>();

        ArbolGeneral<String> arbolGeneralO =
                new ArbolGeneral<>("O");

        arbolGeneralM.hijos.add(arbolGeneralO);


//        ArrayList<ArbolGeneral<String>> hijosDeB =
//                new ArrayList<>();
//
//        ArbolGeneral<String> arbolGeneralF =
//                new ArbolGeneral<>("F");
//
//        hijosDeB.add(arbolGeneralF);
//
//        ArbolGeneral<String> arbolGeneralG =
//                new ArbolGeneral<>("G");
//
//        hijosDeB.add(arbolGeneralG);
//
//        arbolGeneralB.hijos = hijosDeB;


//        arbolInicial.preorden(arbolInicial);
        arbolInicial.postOrden(arbolInicial);
    }

    public void preorden(ArbolGeneral<T> arbolGeneral){
        if(arbolGeneral != null) {
            System.out.println(arbolGeneral.dato);
            if(arbolGeneral.hijos!=null) {
                for (ArbolGeneral<T> hijo : arbolGeneral.hijos)
                    preorden(hijo);
            }
        }
    }
    public void postOrden(ArbolGeneral<T> arbolGeneral){
        if(arbolGeneral != null) {
            if(arbolGeneral.hijos!=null) {
                for (ArbolGeneral<T> hijo : arbolGeneral.hijos)
                    postOrden(hijo);
            }
            System.out.println(arbolGeneral.dato);
        }
    }
}
