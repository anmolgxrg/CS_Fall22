package OOPS.finalvar;

class a{
    final int x = 5;
    
    void show(){
        System.out.println(x);
    }

    a(){
        x=5; //error is generated if you try to change the value
        }

    }

public class fv1 {

    public static void main(String[] args){
    a a1 = new a();
    a1.show();

    }
}

