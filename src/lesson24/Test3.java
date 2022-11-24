package lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.pomosh();
        h.tushitPojar("voda");
        s.swim();
    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher extends Employee implements Help_able {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }

    public void tushitPojar(String s) {
        System.out.println("Uchitel tushit pojar s pomoshyu " + s);
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }

    public void pomosh() {
        System.out.println("Voditel okazivaet pomosh");
        System.out.println(a);
    }

    public void tushitPojar(String s) {
        System.out.println("Voditel tushit pojar s pomoshyu " + s);
    }

    public void swim() {
        System.out.println("Voditel mojet plavat");
    }
}

interface Help_able {
    void pomosh();

    void tushitPojar(String predmet);

    public final static int a = 10;
}

interface Swim_able {
    void swim();
}

abstract class Y implements Swim_able {

}

abstract class X extends Y {}

class Z extends Y {
    public void swim() {}
}