package OOPS.fourcasesofinstanceandstatic;

class a3{
    static int x =10;
    void show(){
        System.out.println(x);
    }
}

public class staticinstance {

    public static void main(String[] args){
    a3 a1 = new a3();
    a1.show();

    }
    
}
