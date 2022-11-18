package lesson19;

public class Test5 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"mat analyz", "filosofiya"};
        for (String st : students) {
            for (String ex : exams) {
                System.out.println(st + " " + ex);
            }
        }
    }
}
