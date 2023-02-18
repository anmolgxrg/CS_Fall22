package datastructures.tsk;

import java.util.Comparator;
import java.util.TreeSet;

public class stringlengthcompare {
public static void main(String[] args){

    String s = "the status is a good";
    TreeSet<String> ss = new TreeSet<>(new extra());
    System.out.println(s);
    int pos=0;
    int start=0;
    String word;

    while (true) {
        start = s.indexOf(" ",pos);
        if(start==-1){
            word=s.substring(pos);
            ss.add(word);
            break;
        }
        word=s.substring(pos, start);
        ss.add(word);
        pos=start+1;
    }

    System.out.println(ss);
}
}
class extra implements Comparator<String>
{
    @Override
    public int compare(String s1, String s2){
        return s1.length()-s2.length();

    }
 }