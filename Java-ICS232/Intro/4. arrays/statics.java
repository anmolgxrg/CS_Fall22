package arrays;

public class statics {
    
    public static void main(String[] args){
    
        boolean ar[];         //intiliazing array
        ar = new boolean[5];

        ar[4]=true;           //giving value

        System.out.println(ar[3]); //default value
        System.out.println(ar[4]); //printing value
        System.out.println(ar.length); //printing length
        System.out.println(ar);

        for(int i=0; i<ar.length; i++)  //printing using for method 1 (more useful)
        System.out.println(ar[i]);
        
        // for(boolean a : ar)     //printing using for method 2
        // System.out.println(a);

    }
}
