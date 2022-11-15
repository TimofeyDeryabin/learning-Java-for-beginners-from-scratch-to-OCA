package homework.lesson16;

public class Lesson16 {
    public static void email(String emails) {
        for (int c = 0; c < emails.length(); c++) {
            int a = emails.indexOf('@', c);
            int b = emails.indexOf('.', c);
            String s1 = emails.substring(a + 1, b);
            System.out.println(s1);
            c = emails.indexOf(';', c);
            if (c < 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
