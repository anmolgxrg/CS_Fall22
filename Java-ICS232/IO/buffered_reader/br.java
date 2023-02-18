package input.output.buffered_reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class br {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bs = new BufferedWriter(new FileWriter("d:/" + args[0]));

        String s = " ";
        System.out.println("enter quit in a new line to quit");

        while (true) {
            s = br.readLine();
            if (s.equals("quit"))
                break;
            bs.write(s);
            bs.newLine();

        }
        br.close();
        bs.close();

    }

}
