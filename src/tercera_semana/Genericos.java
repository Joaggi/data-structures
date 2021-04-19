package tercera_semana;

public class Genericos <Generico>{
    Generico dato;


    public static void main(String[] args) {
        Genericos<Integer> genericos = new Genericos<Integer>();
        genericos.dato = 26;
        System.out.println(genericos.dato);

        genericos.dato = 3;
        System.out.println(genericos.dato);
    }

}
