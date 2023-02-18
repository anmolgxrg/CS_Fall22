package input.output.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class concept {

    public static void main(String[] args) throws Exception{
    
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("d:/marks.txt"));
        dos.writeInt(10);
        dos.writeBoolean(true);
        dos.writeFloat(1.11f);
        dos.writeChars("Hello There");;
        dos.close();
        DataInputStream dis = new DataInputStream(new FileInputStream("d:/marks.txt"));
        boolean b = dis.readBoolean();
        int i = dis.readInt();
        Float f = dis.readFloat();
        String s = dis.readLine();
        System.out.println(i+ "," +b+ "," +f+ "," +s);
        dis.close();


    }
    
}
