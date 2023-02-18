package OOPS.finalvar;

class bfinal{
    final int X;

    bfinal(){
      X=10;
    }

    void show1(){
        System.out.println(X);
    }
    }


public class balnkfinal {

    public static void main(String[] args){
    
        bfinal b = new bfinal();
        b.show1();
    
    }
    
}
