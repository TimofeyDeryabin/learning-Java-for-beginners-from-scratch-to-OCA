package homework.lesson12;

import lesson11.Student;

public class StudentTest {

    static void sravnenieStudentov1(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("Studenty s1 i s2 ravny");
        } else {
            System.out.println("Studenty s1 i s2 ne ravny");
        }
    }

    static void sravnenieStudentov2(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Studenty ravny po vsem parametram");
                } else {
                    System.out.println("Studenty ne ravny tolko po ocenkam");
                }
            } else {
                if (s1.grade == s2.grade) {
                    System.out.println("Studenty ne ravny tolko po kursam");
                } else {
                    System.out.println("Studenty ravny tolko po imenam");
                }
            }
        } else {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Studenty ravny tolko po kursam i ocenkam");
                } else {
                    System.out.println("Studenty ravny tolko po kursam");
                }
            } else {
                if (s1.grade == s2.grade) {
                    System.out.println("Studenty ravny tolko po ocenkam");
                } else {
                    System.out.println("Studenty ne ravny ni po odnomy is parametrov");
                }
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Petr", 3, 5.3);
        Student st2 = new Student("Petr", 1, 5.3);
        sravnenieStudentov1(st1, st2);
        sravnenieStudentov2(st1, st2);
    }
}
