package OOPS.inheritance;

interface x{
    void calcarea();
}

// interface y extends x{
//     void calvol();
// }

class tri implements x{
    int h = 10;
    int b = 20;
     public void calcarea(){
        System.out.println(1/2*h*b);
}
}

// class tri implements y{
//     int l = 10;
//     public void calvol(){
//         System.out.println(1/2*h*b*l);
// }

// }

class circle implements x{
    int r = 10;
    public void calcarea(){
        System.out.println(3.14*r*r);
    }

}

public class interface1 {

public static void main(String[] args){

    tri t = new tri();
    st(t);
    circle cc = new circle();
    st(cc);
}
    static void st(x v){
      v.calcarea();  
    }
}

