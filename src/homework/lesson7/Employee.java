package homework.lesson7;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void showId(){
        System.out.println(id);
    }

    public void showSurname(){
        System.out.println(surname);
    }

    public void showSalary(){
        System.out.println(salary);
    }

    public Employee(String surname3, int age3){
        this(0, surname3, age3, 0, null);
    }

    Employee(int id2, String surname2, int age2){
        this(id2, surname2, age2, 0, null);
    }

    private Employee(int id4, String surname4, int age4, double salary4, String department4){
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivanov", 24);
        Employee emp2 = new Employee(2, "Petrov", 36);
        Employee emp3 = new Employee(3,"Sidorov", 41, 500, "IT");

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        System.out.println(emp1.salary);
        emp1.showId();
        emp1.showSurname();
        emp1.showSalary();

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
        System.out.println(emp2.salary);
        emp2.showId();
        emp2.showSurname();
        emp2.showSalary();

        System.out.println(emp3.id);
        System.out.println(emp3.surname);
        System.out.println(emp3.salary);
        emp3.showId();
        emp3.showSurname();
        emp3.showSalary();
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivanov", 24);
        Employee emp2 = new Employee(2, "Petrov", 36);
//        Employee emp3 = new Employee(3,"Sidorov", 41, 500, "IT");

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary);
        emp1.showId();
        emp1.showSurname();
        emp1.showSalary();

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
//        System.out.println(emp2.salary);
        emp2.showId();
        emp2.showSurname();
        emp2.showSalary();

//        System.out.println(emp3.id);
//        System.out.println(emp3.surname);
//        System.out.println(emp3.salary);
//        emp3.showId();
//        emp3.showSurname();
//        emp3.showSalary();
    }
}
