package OOPS.inheritance;

class shape {
    void calarea() {
    }
}

class sq extends shape {
    int l = 10;

    void calarea() {
        System.out.println(l * l);
    }
}

class rect extends shape {
    int l=10, w = 20;

    void calarea() {
        System.out.println(w * l);
    }
}

public class shapeo {
    public static void main(String[] args) {
        sq s = new sq();
        s.l = 10;
        abc(s);
        rect r = new rect();
        r.l = 10;
        abc(r);
    }

    static void abc(shape p) {
        p.calarea();
    } 

}