package homework.lesson5;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id2, String surname2, int age2, double salary2, String department2){

        id = id2;
        surname = surname2;
        age = age2;
        salary =  salary2;
        department = department2;
    }

    double uvelichenieZP(){
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Ivanov", 20, 200.53, "IT");
        Employee emp2 = new Employee(2, "Petrov", 25, 140.60, "Kadry");

        emp1.uvelichenieZP();
        emp2.uvelichenieZP();

        System.out.println(emp1.salary);
        System.out.println(emp2.salary);

    }
}
