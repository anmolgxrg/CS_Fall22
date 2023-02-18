package input.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class imgreadwrt {

    public static void main(String[] args)throws Exception {

        File f1 = new File("d:/javaprog/logo.png");

        if (f1.exists()) {
        FileInputStream fis=new FileInputStream(f1);
        FileOutputStream fos=new FileOutputStream("d:/javaprog/logo.jpg");

        int x=0;
        while((x=fis.read())!=-1)
        {
            fos.write(x);
        }
        fis.close();
        fos.close();

        }
    }
}
