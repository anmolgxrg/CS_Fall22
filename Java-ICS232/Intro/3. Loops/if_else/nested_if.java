package loops.if_else;

public class nested_if {

    public static void main(String[] args){
    
        int marks = 50;
        int attendance = 30;

        if (marks >= 40)
        {
            if (attendance>=40) {
              System.out.println("Marks ok");
              System.out.println("Attendance ok");
            }
            else{
                System.out.println("Marks ok");
                System.out.println("Attendance Not ok");
            }
        }

        else {

            if (attendance>=40) {
                System.out.println("Marks Not ok");
                System.out.println("Attendance ok");
              }
              else{
                  System.out.println("Marks Not ok");
                  System.out.println("Attendance Also Not ok");
              }
  
        }


    }
    
}
