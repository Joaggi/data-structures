package decima_semana;

public class CondicionalTernario {
    public static void main(String[] args) {
        int numero = 10;
        String respuesta = null;
//
//        if(numero > 5){
//            respuesta = "mayor que 5";
//        }
//        else{
//            respuesta = "menor o igual que 5";
//        }

        respuesta = numero>5 ? "mayor que 5" : "menor o igual que 5";

        System.out.println(respuesta);
    }
}
