package homework.lesson9;

public class Lesson9 {
    public static void main(String[] args) {
        Lesson9 l1 = new Lesson9();
        l1 = new Lesson9();
        Lesson9 l2 = new Lesson9();
        l2 = null;
        l2 = l1;
        Lesson9 l3 = new Lesson9();
        Lesson9 l4 = new Lesson9();
        l3 = new Lesson9();
        l4 = l1;
        Lesson9 l5 = new Lesson9();
        l5 = new Lesson9();
        l5 = null;

    }
}

class Test1 {
    int a = 1;
    static int b = 2;
    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }
}

class Test2 {
    int a = 1;
    static int b = 2;
    static void abc(final int a) {
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}

class Test3 {
    int a = 1;
    static int b = 2;
    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}
