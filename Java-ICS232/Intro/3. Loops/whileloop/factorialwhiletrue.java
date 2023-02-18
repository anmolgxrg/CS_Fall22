package loops.whileloop;

public class factorialwhiletrue {
 
    public static void main(String[] args){
    
        int x=1;
        int fac=1;

        while (true) {

            if (x>10) {

                break;
            }
            x++;
            fac = fac*x;
            System.out.println("Factorial is" +fac);

        }

    //     while(x<10)
    //     {
    //      x++;  
    //         if(x==3)
    //         {
    //             continue;
    //         }
    //         System.out.println(x);
    //     }
    //     System.out.println("after while");
    // }
}
}
