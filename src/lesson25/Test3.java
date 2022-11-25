package lesson25;

import java.sql.Driver;

public class Test3 {
    public static void main(String[] args) {
        Employee1 emp1 = new Doctor1();
//        Help_able h = new Doctor();
//        h.help();
//        System.out.println(((Doctor1) h).specializaciya);
//        ((Doctor1) h).lechit();
        Employee1 emp2 = new Teacher1();
        Employee1 emp3 = new Driver1();
//        Doctor1 d1 = (Doctor1) emp1;
//        System.out.println(((Doctor1) emp1).specializaciya);
//        ((Doctor1) emp1).lechit();
//        Employee1 emp = new Doctor1();
//        ((Doctor1) emp).help();
//        Employee1 e = new Employee1();
//        Test3 t = new Test3();
//        System.out.println(e.equals(t));
        Employee1 emp4 = new Employee1();
        Employee1[] array = {emp1, emp2, emp3, emp4};
        for (Employee1 e : array) {
            if (e instanceof Driver1) {
                System.out.println(((Driver1) e).nazvanieMashini);
                ((Driver1) e).vodit();
            }
        }
    }
}

class Employee1 {
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

class Doctor1 extends Employee1 implements Help_able1 {
    String specializaciya = "xirurg";

    void lechit() {
        System.out.println("Lechit");
    }

    public void help() {
        System.out.println("Doctor okazivaet pomosh");
    }
}

class Teacher1 extends Employee1 {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver1 extends Employee1 {
    String nazvanieMashini = "Mersedes";

    void vodit() {
        System.out.println("Vodit");
    }
}

interface Help_able1 {
    void help();
}