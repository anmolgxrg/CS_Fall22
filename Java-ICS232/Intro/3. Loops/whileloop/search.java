package loops.whileloop;

public class search {

    public static void main(String[] args){
    
    int x=50;
    int num=155;
    boolean a=false;

    while (x<101) {
        x++;
        if (x==num){
            a=true;
            System.out.println("found");
            break;
        }

       }
          if(a==false)  {

            System.out.println("Not Found");

            
        }
        
    }
    

    }
    

