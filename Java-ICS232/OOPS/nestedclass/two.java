package OOPS.nestedclass;

class a{

    int x = 5;
    static int y = 6;
    class b{
        void add(){
            System.out.println(x+y);
        }
    }

}


public class two {

    public static void main(String[] args){
    
        a ao1 = new a();
        ao1.x=1;
        a ao2 = new a();
        ao2.x=111;

        a.b c = ao1.new b();
        c.add();
    
    }
    
}
