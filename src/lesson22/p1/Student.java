package lesson22.p1;

import lesson22.*;

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();

        Human h = new Human();
        System.out.println(Human.salary);
        Human.rest();
    }
}

class Test {
    public static void main(String[] args) {
        Student s = new Student();
//        System.out.println(s.name);
//        s.work();
    }
}
