package datastructures;

// import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {

        // HashSet<String> hs = new HashSet<>(); Randomly stores items

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Hello");
        ts.add("Everyone");
        ts.add("I");
        ts.add("I");
        ts.add("am");
        ts.add("From");
        ts.add("Chd");
        System.out.println(ts);

        Iterator<String> i = ts.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    
    }
}
