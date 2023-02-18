package OOPS.nestedclass.insidemethod;


class a{

    void show(int y){

        int x=1;

        class b{
            void add(){
            System.out.println(x+y);
        }
    }
        b bo = new b();
        bo.add();
    }
}




public class one {

    public static void main(String[] args){

        a ao = new a();
        ao.show(5);
    
    }
    
}
