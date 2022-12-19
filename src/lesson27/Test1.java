package lesson27;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
    }
}

class Animal {
    int a = 5;
    static int b = 10;

    void abc() {
        System.out.println("non-static method iz klassa Animal");
    }

    static void def() {
        System.out.println("static method iz klassa Animal");
    }
}

class Tiger extends Animal {
    int a = 15;
    static int b = 20;

    void abc() {
        System.out.println("non-static method iz klassa Tiger");
    }

    static void def() {
        System.out.println("static method iz klassa Tiger");
    }
}