package datastructures;

import java.util.HashSet;
import java.util.StringTokenizer;

public class stringtoset {

    public static void main(String[] args) {

        String s = "i am am anmol";
        HashSet<String> hs = new HashSet<>();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            hs.add(st.nextToken());
        }
        System.out.println(hs);

    }

}
