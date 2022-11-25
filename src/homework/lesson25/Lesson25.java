package homework.lesson25;

public class Lesson25 {

}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
    }

    void sleep() {
        System.out.println("Vsegda interesno nablyudat kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
    }

    abstract void fly();

    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
    }

    void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }

    void eat() {
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
    }

    void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }

    void fly() {
        System.out.println("Pingvini ne umeyt letat!");
    }

    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi.");
    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
    }

    void eat() {
        System.out.println("Lev, kak lyuboy xishnik, lyubit myaso!");
    }

    void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }

    void run() {
        System.out.println("Lev-eto ne samaya bistraya koshka!");
    }
}

class Lesson24 {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Mecha1");
        Animal a2 = new Pingvin("Pingvi1");
        Animal a3 = new Lev("Leva1");
        Fish f1 = new Mechenosec("Mecha2");
        Bird b1 = new Pingvin("Pingvi2");
        Mammal mam1 = new Lev("Leva2");
        Mechenosec m1 = new Mechenosec("Mecha3");
        Pingvin p1 = new Pingvin("Pingvi3");
        Lev l1 = new Lev("Leva3");
        Speakable s1 = new Pingvin("Pingvi4");
        Speakable s2 = new Lev("Leva4");

        Speakable[] array1 = {b1, mam1, p1, l1, s1, s2};
        Animal[] array2 = {a1, a2, a3, f1, b1, mam1, m1, p1, l1};
        for (Speakable s : array1) {
            if (s instanceof Pingvin) {
                Pingvin ping = (Pingvin) s;
                System.out.println(ping.name);
                ping.eat();
                ping.sleep();
                ping.fly();
                ping.speak();
            }
            if (s instanceof Lev) {
                Lev lev = (Lev) s;
                System.out.println(lev.name);
                lev.eat();
                lev.sleep();
                lev.run();
                lev.speak();
            }
        }

        for (Animal an : array2) {
            if (an instanceof Mechenosec) {
                Mechenosec mech = (Mechenosec) an;
                System.out.println(mech.name);
                mech.eat();
                mech.sleep();
                mech.swim();
            }
            if (an instanceof Pingvin) {
                Pingvin ping = (Pingvin) an;
                System.out.println(ping.name);
                ping.eat();
                ping.sleep();
                ping.fly();
                ping.speak();
            }
            if (an instanceof Lev) {
                Lev lev = (Lev) an;
                System.out.println(lev.name);
                lev.eat();
                lev.sleep();
                lev.run();
                lev.speak();
            }
        }
    }
}
