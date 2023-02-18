package input.output;

import java.io.File;

public class tut {
    public static void main(String[] args) {

        File f = new File("d:/javaprog/abc/pics");

        if (f.exists()) {
            File s[] = f.listFiles();
            for (File a : s) {
                if (a.isDirectory()) {
                    System.out.println(a + " is directory");
                }
                System.out.println(a);
            }
        } else {
            f.mkdirs();
            System.out.println("done");
        }
        File f2 = new File("d:/javaprog/first.java");
        f2.setReadOnly();
        f2.setWritable(true);
        System.out.println(f2.length());

    }
}
