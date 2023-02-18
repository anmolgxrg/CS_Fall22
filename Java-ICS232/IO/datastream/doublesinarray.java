package input.output.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class doublesinarray {

    public static void main(String[] args) throws Exception {
    //   HashMap<String,String>hm =new HashMap<>();
    //   hm.put("icei","444");
    //   hm.put("9i","555");
student k=new student("icei",555);
k.rollno=1000;
        ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("d:/obj.txt"));
        dos.writeObject(k);
        dos.close();
        ObjectInputStream dis = new ObjectInputStream(new FileInputStream("d:/obj.txt"));
        student aa =(student)dis.readObject();
        aa.rollno=40;
        System.out.println(aa.name+","+aa.rollno);
        dis.close();

    }
}

    class student implements Serializable {
        String name;
        transient int rollno;

        student(String a, int b) {
            this.name = a;
            this.rollno = b;
        }
    }

