package lesson24;

public class Test6 {

}

interface I4 {
    private static void method1() {
        System.out.println("Static method1");
    }

    private void method2() {
        System.out.println("non-static method");
    }

    default void method3() {
        method1();
        method2();
    }

    static void method4() {
        method1();
    }
}
