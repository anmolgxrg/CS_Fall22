package loops.whileloop;

public class factorial {
 
    public static void main(String[] args){
    
        int x=1;
        int fac=1;

        while (x<11 ) {

            x++;
            fac = fac*x;
            System.out.println("sum is" +fac);
        }
    }
}
