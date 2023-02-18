package OOPS.fourcasesofinstanceandstatic;


class a{
    int x = 10;
    void show(){
        System.out.println(x);
    }

}

public class bothinstance {

    public static void main(String[] args){

        a b = new a();
        b.show();
    }
    
    
}
