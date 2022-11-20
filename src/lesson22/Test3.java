package lesson22;

public class Test3 {
    void uvelichenieZP(Employee e) {
        e.salary = e.salary + 100;
    }
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.sleep();
        doc.lechit();
    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat() {
        System.out.println("Kushat");
    }
    void sleep() {
        System.out.println("Spat");
    }
}

class Doctor extends Employee {
    void lechit() {
        System.out.println("Lechit");
    }
}

class Xirurg extends Doctor {
    String skalpel;
    void operaciya() {}
}

class Dantist extends Doctor {

}

class Teacher extends Employee {
    int kolichestvoUchenikov;
    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {
    String nazvanieMashini;
    void vodit() {
        System.out.println("Vodit");
    }
}