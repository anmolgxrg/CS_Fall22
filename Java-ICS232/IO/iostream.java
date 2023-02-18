package input.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class iostream {
    
        
        public static void main(String[] args)throws Exception {
    
            File f1 = new File("d:/javaprog/first.java");
    
            if (f1.exists()) {
            FileInputStream fis=new FileInputStream(f1);
            FileOutputStream fos=new FileOutputStream("d:/javaprog/aaa.txt",true);
    
         fos.write("hello how are you".getBytes());
            fis.close();
            fos.close();
    
            }
        }
    }
    