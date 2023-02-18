package loops.whileloop;

public class prime100to200 {

    public static void main(String[] args) {

        int x = 2;
        int n = 1;
        boolean a = false;

        while (n < 200) {
            
            if (n%x == 0) {
                a = true;
                break;
            }

            x++;

        }

        if (a == true && n!=1){
        System.out.println(" " +n);
        }
        n++;
    

    }

}
