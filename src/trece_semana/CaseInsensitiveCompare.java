package trece_semana;

import java.util.Comparator;

public class CaseInsensitiveCompare implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        String lowerCaseS1 = s.toLowerCase();
        String lowerCaseT1 = s.toLowerCase();

        return lowerCaseS1.compareTo(lowerCaseT1);
    }
}
