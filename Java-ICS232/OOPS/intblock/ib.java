package OOPS.intblock;

class bfinal{

    final int X;

    {
        System.out.println("instance block");

    }

    static{
        System.out.println("static block");
    }

    bfinal(){
      X=10;
    }

    void show1(){
        System.out.println(X);
    }
    }


public class ib {

    public static void main(String[] args){
    
        bfinal b = new bfinal();
        b.show1();
        bfinal c = new bfinal();
        c.show1();

    }
    
}
