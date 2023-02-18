package OOPS.constructors;

class cube{
    int l;
    int h;
    int w;

    void vol(){
    System.out.println(l*h*w);
    }

    // cube (int a, int b, int c){
    //     l=a;
    //     h=b;
    //     w=c;
    //}
    cube (int l, int h, int w){
        this.l=l;
        this.h=h;
        this.w=w;
    }

    cube (int a){
        this.l=a;
        this.h=a;
        this.w=a;
    }

    cube(){
        l=h=w=5;
    }

}

public class const2 {

    public static void main(String[] args){
    
    cube c = new cube(10,10,19);
    // cube c = new cube(6);
    // cube c = new cube();
    c.vol();

}
    
}
