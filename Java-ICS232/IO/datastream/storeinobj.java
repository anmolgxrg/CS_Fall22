package input.output.datastream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class storeinobj {

    public static void main(String[] args) throws Exception {

        HashMap<String, Integer> hm ;

        ObjectInputStream dis = new ObjectInputStream(new FileInputStream("d:/objstr.txt"));
         hm = (HashMap<String, Integer>) dis.readObject();
        if (hm==null) {
            System.out.println("previous data");
            hm=new HashMap<>();
        }         
        else {
            System.out.println(hm);
            Scanner s = new Scanner(System.in);
            System.out.println("enter your data of 4 names  and rollnos ");
            for (int i = 0; i <= 3; i++) {
                String name = s.next();
                int rollno = s.nextInt();
                hm.put(name, rollno);
            }
            s.close();
            dis.close();

        }

        ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("d:/objstr.txt"));
        dos.writeObject(hm);
        dos.close();
        // ObjectInputStream dis2 = new ObjectInputStream(new FileInputStream("d:/objstr.txt"));
        // HashMap<String, Integer> aaa = (HashMap<String, Integer>) dis2.readObject();
        // System.out.println(aaa);
        // dis2.close();

    }
}
