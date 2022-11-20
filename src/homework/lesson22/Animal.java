package homework.lesson22;

public class Animal {
    Animal() {
        System.out.println("I am an animal");
    }

    int eyes;

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }

    String name;
    int tale = 1;
    int paw = 4;

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    Dog(String n) {
        name = n;
        System.out.println("I am a dog and my name is: " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    Cat(String n) {
        name = n;
        System.out.println("I am a cat and my name is: " + name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog d = new Dog("Sharik");
        System.out.println(d.paw);
        Cat c = new Cat("Malysh");
        c.sleep();
    }
}
