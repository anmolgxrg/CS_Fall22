package OOPS.objectcall;

class a{
    static void show(int a, int b){
        a+=3;
        b+=3;
        System.out.println(a+","+b);
    }
}

public class callbyvalue {

 public static void main(String[] args){
    int aa = 10;
    int b = 10;
    System.out.println(aa+","+b);
    a.show(aa,b);
    System.out.println(aa+","+b);
 
 }
    
}
