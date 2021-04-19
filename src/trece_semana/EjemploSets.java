package trece_semana;

import java.util.Set;
import java.util.TreeSet;

public class EjemploSets {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<String>( new CaseInsensitiveCompare( ) );
        s.add( "Hello" );
        s.add( "HeLLo" );
        System.out.println( "The size is: " + s.size( ) );
    }

}
