package Chapter7_Day13;

import java.util.Enumeration;
import java.util.StringTokenizer;

public class TestEnumeration {
    public static void main(String[] args) {
        Enumeration enumeration = new StringTokenizer("ab-c*-df-g", "-");
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
