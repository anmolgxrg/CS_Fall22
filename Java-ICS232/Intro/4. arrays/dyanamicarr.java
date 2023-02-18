package arrays;


public class dyanamicarr {

    public static void main(String[] args){
    
    int ar[] ={2,2,3,2,2,4,1,2,2};
    // int sum = 0;
    // int num=2;
    // boolean a=false;

    // for(int b :ar)          //printing
    // System.out.println(b);
    
    // for (int c : ar)     //sum
    // sum+=c ;
    // System.out.println(+sum);

    // for(int i=0; i<ar.length;i++){    //search
    // if(ar[i]==num){
    //     a = true;
    //     System.out.println("found"+i);
        
    // }
    // }

    // if(a==false)
    //     System.out.println("Not found");    


    for(int i=0; i<ar.length-1; i++){
    if(ar[i]==ar[i+1])
    System.out.println("yes at " +i);
    }


    }
        
    }
    