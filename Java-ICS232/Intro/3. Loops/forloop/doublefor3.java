package loops.forloop;

public class doublefor3 {

    public static void main(String[] args){
        
       abc: for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(i==2)
                continue abc;
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("all over");

        
    }    
}