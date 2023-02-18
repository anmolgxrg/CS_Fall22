package input.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class readhalfwrt {

    public static void main(String[] args) throws Exception {

        File f2 = new File("d:/javaprog/first.java");

        if (f2.exists()) {
            FileInputStream fis1 = new FileInputStream(f2);
            FileOutputStream fos1 = new FileOutputStream("d:/javaprog/h11.txt");
            FileOutputStream fos2 = new FileOutputStream("d:/javaprog/h22.txt");
            long l = f2.length();
            long d = l / 2;
            int count = 0;
            int x = 0;
            while (count < d) {
                x = fis1.read();
                fos1.write(x);
                count++;

            }
            fos1.close();
            while ((x = fis1.read()) != -1) {
                fos2.write(x);
            }
            fos2.close();
            fis1.close();
        }
    }
}
