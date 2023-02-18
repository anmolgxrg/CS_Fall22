package arrays;

public class searchin2d {

    public static void main(String[] args){
    
        int ar[][] = {{1,2,3,4},{5,6,7,8}};
        int num =55;
        int x=3;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {

                if(ar[i][j]==num){
                    System.out.println("Found");
                    x=1;
                    break;
                }
            }
        }

                if(x==3){
                    System.out.println("Not Found");
                }

                
           
            
        }
    
    }