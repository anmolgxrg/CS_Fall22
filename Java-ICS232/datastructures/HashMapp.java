package datastructures;

// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.Set; 
    import java.util.*;

public class HashMapp {

    public static void main(String[] args) {

        
        HashMap<String, HashSet<String>> hs = new HashMap<>();

        HashSet<String> jj = new HashSet<>();
        jj.add("9915182045") ;
        jj.add("99151820555545") ;


        hs.put("anmol", jj);

        HashSet<String> rr = new HashSet<>();
        rr.add("991929898") ;
        rr.add("985542197") ;

        hs.put("rakes3h", rr);

        Set<String> keys = hs.keySet();
        Iterator<String> i = keys.iterator();
        if (hs.containsValue(jj)) {
            while (i.hasNext()) {
                String k = i.next();
                HashSet<String> v = hs.get(k);
                System.out.println(k + "," + v);
                if (v.equals("jj"))
                    System.out.println("Record Found with Name:" +k);
            }
        } else {
            System.out.println("Sorry! No Record Found");
        }


    }

}
