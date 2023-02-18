package oops.FIRST;

class student {

    public static void main(String s[]) {
        System.out.println(college);
    }

    int rollno, marks;
    String name;
    static String college = "icei";

    void passorfail() {
        if (marks > 40)
            System.out.println("pass");
        else
            System.out.println("fail");
    }
}


public class sfirst {
    public static void main(String[] a) {
         student ram = new student(); 
          ram.rollno=111;
          ram.name="Ram Kumar";
          ram.marks=99;
          ram.passorfail();
        //   college;
         
    }
}