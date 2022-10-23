package homework.lesson7.lesson7_1;

import homework.lesson7.Employee;

public class TretiyClass {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivanov", 24);
//        Employee emp2 = new Employee(2, "Petrov", 36);
//        Employee emp3 = new Employee(3,"Sidorov", 41, 500, "IT");

//        System.out.println(emp1.id);
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary);
        emp1.showId();
        emp1.showSurname();
        emp1.showSalary();

//        System.out.println(emp2.id);
//        System.out.println(emp2.surname);
//        System.out.println(emp2.salary);
//        emp2.showId();
//        emp2.showSurname();
//        emp2.showSalary();
//
//        System.out.println(emp3.id);
//        System.out.println(emp3.surname);
//        System.out.println(emp3.salary);
//        emp3.showId();
//        emp3.showSurname();
//        emp3.showSalary();
    }
}
