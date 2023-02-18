package datastructures;

import java.util.ArrayList;


public class arraylist {
public static void main(String[] args){

    ArrayList<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(4);

    a.add(1,2);
    a.add(2,3);
    ArrayList<Integer> aa = new ArrayList<>();
    aa.add(10);
    aa.addAll(a);
    System.out.println(aa.size());
  System.out.println(aa.contains(10));
    for(int i=0; i<aa.size(); i++)
    System.out.println(aa.get(i));
   

    //  ArrayList a = new ArrayList();
    //  a.add(5);
    //  a.add(5.1);
    //  a.add("anmol");
    //  Object aa = a.get(0);
    //  Integer pp = (Integer)aa;
    //  System.out.println(pp.intValue());

    //  Object aaa = a.get(1);
    //  double cc =Double.parseDouble(aa);
    //  System.out.println(cc);
    // Double dd = (Double)aaa;
    // System.out.println(dd.doubleValue());
  
    // Object aaaa = a.get(2);
    // String ss = (String)aaaa;
    // System.out.println(ss);
}
}
