package OOPS.inheritance;

abstract class s3 {
    abstract void cell();
}

class x2 extends s3 {
    int l = 5;

     void cell() {
        System.out.println(l * l);
    }
}

class y2 extends s3 {
    int l, w = 10;

     void cell() {
        System.out.println(w * l);
    }
}

public class abstract1 {
    public static void main(String[] args) {
        x2 aa = new x2();
        ab(aa);
        y2 aa1 = new y2();
        ab(aa1);
    }

    static void ab(s3 cy) {
        cy.cell();
    }
}