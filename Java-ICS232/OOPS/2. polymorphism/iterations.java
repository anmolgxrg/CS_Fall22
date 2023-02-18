package oops.polymorphism;


    class operations1 {

        static void add(int a, int b) {
            System.out.println(a+b);
        }
    
        void multiply(int a, int b) {
            System.out.println(a*b);
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
    }
    
public class iterations {

    
    public static void main(String[] args) {

        operations1.add(6,7);

        operations1 a = new operations1();

        a.multiply(5, 7);
        System.out.println(a.divide(5, 7));
        System.out.println(a.subtract(5, 7));

    }


}