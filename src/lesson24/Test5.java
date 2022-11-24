package lesson24;

public class Test5 {

}

interface I1 {
    default void abc() {
        System.out.println("eto method abc");
    }

    static void def() {
        System.out.println("static method 1");
    }
//    void abc();
//
//    default void ghi() {
//        System.out.println("eto method ghi");
//    }
//
//    default void def() {
//        System.out.println("eto method def");
//    }
}

interface I2 extends I1 {
//    void abc();
}

interface I3 {
    static void def() {
        System.out.println("static method 2");
    }
}

abstract class O {}

class R extends O implements I1 {
    static I2 method1(I2 i) {
        return new D2();
    }

    public static void main(String[] args) {
        I2 i = new D2();
        method1(i);
    }
}

class D2 implements I2 {}

//class Z2 implements I1 {
//    public void abc() {
//        System.out.println("eto method abc");
//    }
//
//    public void ghi() {
//        System.out.println("eto method ghi iz klassa Z2");
//    }
//
//    public static void main(String[] args) {
//        Z2 z = new Z2();
//        z.abc();
//        z.def();
//        z.ghi();
//    }
//}
