package loops.if_else;

public class greatest {
    public static void main(String[] args){
    
        int a=16;
        int b=7;
        int c=9;
        // Using Turnary Operator
        int greatest=a;

        // if (b/greatest>=1)
        // greatest=b;

        // if (c/greatest>=1)
        // greatest=c;

    // Using Turnary Operator
        greatest=a>b?(a>c?a:c):(b>c?b:c);
    
    System.out.println(greatest);

    }
}
