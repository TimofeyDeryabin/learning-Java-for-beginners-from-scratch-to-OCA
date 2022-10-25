package homework.lesson10.p4;

import homework.lesson10.p1.A;
import static homework.lesson10.p1.p2.B.*;
import homework.lesson10.p1.p2.p3.*;
import homework.lesson10.p4.p5.E;

public class D {
    public int d = 18;
    public void abcdef() {
        System.out.println("Eto metod abcdef classa D");
    }

    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.a);
        a1.abcd();

        System.out.println(b);
        abc();

        C c1 = new C();
        System.out.println(c1.c);
        c1.abcde();

        E e1 = new E();
        System.out.println(e1.e);
        e1.abcdefg();
    }
}
