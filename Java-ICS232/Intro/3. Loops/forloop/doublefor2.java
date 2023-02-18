package loops.forloop;

public class doublefor2 {

    public static void main(String[] args){
    
        int x=1;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<i; j++){
                System.out.print(x);
                x++;

            }
            System.out.println();
        }

        
    }    
}