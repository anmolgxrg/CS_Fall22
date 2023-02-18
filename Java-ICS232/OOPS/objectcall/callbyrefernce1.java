package OOPS.objectcall;


    class a {
        int x;
        void show(a a1){
        a1.x=8;
        System.out.println(a1.x);
        
        }
    }

    public class callbyrefernce1 {

        public static void main(String[] args){
        a aa = new a();
        aa.x=80;
        System.out.println(aa.x);
        aa.show(aa);
        System.out.println(aa.x);
    }

}
