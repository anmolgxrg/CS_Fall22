package loops.whileloop;

public class primeornototherway {

    public static void main(String[] args) {

        int x = 2;
        int num = 18;
        boolean a = false;

        while (x < num) {
            if (num%x == 0) {
                a = true;
                break;
            }

            x++;

        }

        if (a == true)
        System.out.println("Not Prime");

        else
        System.out.println("Prime");

    }
}