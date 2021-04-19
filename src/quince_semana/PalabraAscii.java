package quince_semana;

public class PalabraAscii {
    public static void main(String[] args) {
        String palabra = "Abecedario";

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println((int)palabra.charAt(i));
        }

        int hash = 0;
        int g = 37;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2, 32));

        for (int i = 0; i < palabra.length(); i++) {
            hash = hash*37 + palabra.charAt(i);
            System.out.println("iteración i: " + i + " valor hash: " + hash);
        }
        System.out.println(hash);

        System.out.println(25%19);
        System.out.println(44%19);
    }
}
