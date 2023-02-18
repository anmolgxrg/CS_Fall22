package OOPS.interconstructotcalling;

class a{
    int l,h,w;
   void volume(){
        System.out.println(l*h*w);
    }

    a (int l, int h, int w)
    {
        this(l,h);
        System.out.println("3 value constructor");
        this.w = w;
    }

    a(int l, int h)
    {
        this(l);
        System.out.println("2 value constructor");
        this.h = h;
    }

    a(int l)
    {
        this.l = l;
        System.out.println("1 value constructor");

    }
}

public class frm3to2to1constcall {

public static void main(String[] args){

    a cube = new a(3,2,1);
    cube.volume();
}
    
    
}
