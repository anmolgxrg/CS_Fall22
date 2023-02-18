package arrays;

public class array2d {

    public static void main(String[] args){

        //dynamic declaration
        // int ar[][] = {{1,2,3,4},{5,6,7,8}};
        
        
        //static declaration
        
        int ar[][] = new int [3][];


        // ar[0][1]=3;
        ar[0]=new int[]{1,2,3,4,5};
        ar[1]=new int[]{1,2,3,4,5};
        ar[2]=new int[]{1,2,3,4,5};

        // for (int[]a : ar)
        // {
        //     for(int c : a){
        //     System.out.print(c);}
        //     System.out.println();
        // }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                
        // if(ar[i][j]==7){
        //     ar[i][j]=8;
        // } 
        System.out.print(ar[i][j]);
    }
        System.out.println();
}
}
}