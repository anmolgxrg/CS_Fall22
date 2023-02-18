package input.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class readwrt {

    public static void main(String[] args)throws Exception {

        File f1 = new File("d:/javaprog/first.java");

        if (f1.exists()) {
        FileInputStream fis=new FileInputStream(f1);
        FileOutputStream fos=new FileOutputStream("d:/javaprog/aaa.txt",true);

        // int x=0;
        // while((x=fis.read())!=-1)
        // {
        //     // System.out.print((char)x);
        //     fos.write(x);
        // }
     fos.write("hello how are you".getBytes());
        fis.close();
        fos.close();

        }
    }
}
