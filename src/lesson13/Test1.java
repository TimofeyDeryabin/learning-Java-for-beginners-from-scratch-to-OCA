package lesson13;

public class Test1 {

}

class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(2);
//        if (st1.grade == 2) {
//            System.out.println("Student dvoichnik");
//        } else if (st1.grade == 3) {
//            System.out.println("Student troichnik");
//        } else if (st1.grade == 4) {
//            System.out.println("Student xoroshist");
//        } else if (st1.grade == 5) {
//            System.out.println("Student otlichik");
//        } else {
//            System.out.println("Ochenka neverna");
//        }

        switch (st1.grade) {
            case 2:
                System.out.println("Student dvoichnik");
//                break;
            case 3:
                System.out.println("Student troichnik");
                break;
            case 4:
                System.out.println("Student xoroshist");
                break;
            case 5:
                System.out.println("Student otlichnik");
                break;
            default:
                System.out.println("Ochenka neverna");
        }
    }
}