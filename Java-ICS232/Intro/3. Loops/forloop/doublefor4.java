package loops.forloop;

public class doublefor4 {

    public static void main(String[] args){

        for(int i = 1; i<5; i++){
            for(int j = 0; j<4; j++){
                if(j<4-i)
                System.out.print(" ");
                else
                System.out.print(i);
            }
            System.out.println();
        }

        
    }    
}