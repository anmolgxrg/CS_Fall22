package loops.switch_case;

public class monthdays {

    public static void main(String[] args){
    
        int days=1;
        int t=0;
            while (days<=31) {
                t=days%7+1;
        switch (t) {
                
                case 1:System.out.println("Monday");                
                break;

                case 2:System.out.println("Tuesday");                
                break;

                case 3:System.out.println("Wednesday");                
                break;

                case 4:System.out.println("Thursday");                
                break;

                case 5:System.out.println("Friday");                
                break;

                case 6:System.out.println("Saturday");
                break;

                case 7:System.out.println("Sunday");
                break;


            default: 
                }
                days++;
    }


}
    
}

