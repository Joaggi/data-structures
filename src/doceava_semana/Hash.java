package doceava_semana;

public class Hash {
    public static void main(String[] args) {
        int entero = 3; // Dato primitivo

        String cadena = "hola";
        System.out.println(cadena.hashCode());

        System.out.println(cadena.charAt(3));

        int c = cadena.charAt(3);
        System.out.println(c);

        Integer enteroObjeto = 3;
        System.out.println(enteroObjeto.hashCode());

        EnteroConHashCodePropio enteroConHashCodePropio = new EnteroConHashCodePropio();
        System.out.println(enteroConHashCodePropio.hashCode());
        System.out.println(enteroConHashCodePropio);


    }


}
