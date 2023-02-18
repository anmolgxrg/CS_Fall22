package loops.switch_case;

public class grades {

    public static void main(String[] args){
    
        char grade = 'B';

        switch (grade) {
            case 'A': System.out.println("First Class");                  
                break;

            case 'B': System.out.println("Second Class");                 
                break;

            case 'C': System.out.println("Third Class");                  
                break;
        
            default: System.out.println("Fail");
                
        }
    
    }
    
}
