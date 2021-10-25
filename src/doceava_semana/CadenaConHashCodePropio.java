package doceava_semana;

public class CadenaConHashCodePropio {
    String valor;

    @Override
    public int hashCode(){
        int g = 31;
        int hash = 0;
        for (int i = 0; i < valor.length(); i++){
            hash = g * hash + valor.charAt(i);
        }
        return hash;
    }

    public static void main(String[] args) {
        CadenaConHashCodePropio cadenaConHashCodePropio = new CadenaConHashCodePropio();
        cadenaConHashCodePropio.valor = "Hola";
        System.out.println(cadenaConHashCodePropio.hashCode());
    }
}