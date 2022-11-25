package lesson25;

import org.w3c.dom.ls.LSOutput;

public class Test1 {
    public static void main(String[] args) {
//        Driver[] array1 = {new Driver(), new Driver()};
//        Employee[] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
//        Help_able[] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};

        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Help_able h = new Teacher();
        Employee[] array2 = {emp1, emp2, emp3};
        String s1 = null;
        Object o = new Object();
//        emp1.work();
//        emp2.work();
//        emp3.work();
//        for (Employee emp : array2) {
//            emp.work();
//        }
        System.out.println(o instanceof Teacher);
    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Help_able {
    void work() {
        System.out.println("Teacher works");
    }

    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee implements Help_able {
    void work() {
        System.out.println("Driver works");
    }

    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee implements Help_able {
    void work() {
        System.out.println("Doctor works");
    }

    public void help() {
        System.out.println("Doctor helps");
    }
}

interface Help_able {
    void help();
}