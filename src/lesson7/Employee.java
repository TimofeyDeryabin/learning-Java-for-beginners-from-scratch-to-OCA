package lesson7;

public class Employee {
    protected double salary;

    protected void dvoinayaZP(){
        double result = salary * 2;
        System.out.println("Dvoinaya ZP = " + result);
    }

    protected Employee(double salary2){
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZP();
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZP();
    }
}
