package OOPS.finalvar;


class sf{
    static final int x = 5;
    
    void show(){
        System.out.println(x);
    }
    
    // sf(){
    //     x=5; //cannot set value of static variables in constructor
    //     }
    
    
}
public class staticfinal {

    public static void main(String[] args){
    
        sf sf1 = new sf();
        sf1.show();
    
    
    }

    
    
}
