package oops.polymorphism;

class operations {

    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int subtract(int a, int b) {
        if (a >= b) {
            return a - b;
        }

        else {
            return b - a;
        }
    }

    int divide(int a, int b) {
        if (a >= b) {
            return a / b;
        }

        else {
            return b / a;
        }
    }

    int rem(int a, int b) {
          return a % b;
    }

    int fact(int a){
        int fact=1;
        for(int i=1;i<=a;i++){    
            fact=fact*i;    
        }    
      
        return fact;
    }

}

public class methodops {

    public static void main(String[] args) {

        operations a = new operations();

        System.out.println(a.add(5, 7));
        System.out.println(a.multiply(5, 7));
        System.out.println(a.divide(5, 7));
        System.out.println(a.subtract(5, 7));
        System.out.println(a.rem(5, 7));
        System.out.println(a.fact(5));


    }
}
