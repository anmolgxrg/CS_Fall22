package OOPS.nestedclass;

class a1{

    int x = 5;
    static int y = 6;
static class b1{
    static int k=30;
        void add(){
            System.out.println(y+k);
        }
    }

}


public class one {

    public static void main(String[] args){
    a1 a=new a1();
        a1.b1 c = new a1.b1();
        c.add();
    
    }
    
}
