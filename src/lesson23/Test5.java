package lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        Teacher2 t = new Teacher2();
//        emp.sleep();
//        t.sleep();
//        Employee2 e = new Teacher2();
//        e.sleep();
        System.out.println(t.salary);
    }
}

class Eda1 {}
class Frukti1 extends Eda1 {}

class Employee2 {
    double salary = 100;
    String name = "Kolya";

    final Eda1 eat() {
        System.out.println("Kushaet rabotnik");
        Eda1 e = new Eda1();
        return e;
    }

    final static void sleep() {
        System.out.println("Spit rabotnik");
    }
}

class Teacher2 extends Employee2 {
    String salary = "dvesti";

//    public Frukti1 eat() {
//        System.out.println("Kushaet uchitel");
//        Frukti1 f = new Frukti1();
//        return f;
//    }

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

//    static void sleep() {
//        System.out.println("Spit uchitel");
//    }
}

final class T {}
//class P extends T {}
