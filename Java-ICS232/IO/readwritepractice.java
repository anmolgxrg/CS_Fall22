package input.output;

import java.io.File;
import java.io.FileInputStream;

public class readwritepractice {
    public static void main(String[] args) throws Exception{
    
        File fg =new File("d:/javaprog/aa.txt");
        
        if (fg.exists()) {

            FileInputStream fff = new FileInputStream(fg);

            int a = 0;
            while ((a=fff.read())!=-1)
            {
                System.out.print((char)a);
                
            }
            fff.close();
            
        }
    }
    
}
