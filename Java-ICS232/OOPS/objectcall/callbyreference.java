package OOPS.objectcall;

class cube{

    int l;
    int h;
    int w;

    cube (int a, int b, int c){
        this.l=a;
        this.h=b;
        this.w=c;
    }
    
    cube (cube c){
        this.l=c.l;
        this.h=c.h;
        this.w=c.w;
    }
}    

public class callbyreference {
public static void main(String[] args){

    cube c1 = new cube(1,1,1);
    c1.l=10;
    c1.h=10;
    c1.w=10;
    System.out.println(c1.l);
    System.out.println(c1.h);
    System.out.println(c1.w); 
    
    cube c2 = new cube(c1);
    System.out.println(c2.l);
    System.out.println(c2.h);
    System.out.println(c2.w);

}
}
