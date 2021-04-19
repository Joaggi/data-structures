package tercera_semana;

public class Arreglos{
    public static void main(String[] args) {
        int[] arreglo = new int[10];  // inmutables

        arreglo[1] = 20;

        System.out.println(arreglo);
        float numero = 334563.3234F;

        int[] arregloNew = new int[20];

        for( int i=0; i< arreglo.length; i++){
            arregloNew[i] = arreglo[i];
        }

        arreglo = null; // garbage collection


        // c# -> microsoft -> 1990 {microsft -> c# se parece mucho a c++ pero tiene ciertas diferencias. java sun microsistem}
        // malloc free

        // c c++ > Directamente al kernel. java usa una máquina virtual.
        // c++ -> version 11 -> version 14 -> deprecated -> obsolecencia, Rust
        // dar soporte hacia atras - > boiler plate code -> código de integracíon -> códico de compatibilidad
        // acceso de memoria aleatorio
        // exploits -> array[-999] -> tumbar el sistema, o podía robar
        //
    }
}