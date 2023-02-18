package OOPS.objectcall;


    class a9 {
        int x;
        bb b=new bb();

        void show(a9 a1) 
        {
        a1.x=8;
        System.out.println(a1.x);
        a1=new a9();
        System.out.println(a1.x); //0
        }
    }
    class bb
    {
        int k=0;

         void show() {
            k+=3;
            System.out.println("k incremented by 3");
        }
    }


    public class interclasscalling {

        public static void main(String[] args){

        a9 aa = new a9();
        System.out.println(aa.b.k);
        aa.b.show();
        System.out.println(aa.b.k);
        aa.x=80;
        System.out.println(aa.x);
        aa.show(aa);
        System.out.println(aa.x);
    }

}
