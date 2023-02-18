package loops.whileloop;

public class primeornot {

    public static void main(String[] args){
    
    int x=1;
    int num=17;
    boolean a=false;

    while (x<num) {
        x++;
        if (num%x==0){
            a=true;
            System.out.println("Not Prime");
            break;
        }

       }
          if(a==false)  {

            System.out.println("Prime");

            
        }
        
    }
    

    }
    

