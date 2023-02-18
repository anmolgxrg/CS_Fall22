package loops.whileloop;

public class sumof1to10 {
    

    public static void main(String[] args){
    
        int x=0;
        int sum=0;

        while (x<11 ) {

            x++;
            sum = sum+x;
        }
        System.out.println("sum is" +sum);

    }
}
