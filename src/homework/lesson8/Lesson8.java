package homework.lesson8;

public class Lesson8 {
    public static double proizvedeniyeTrexChisel(double a, double b, double c) {
        return a * b * c;
    }

    public static void deleniyeDvuxChisel(double a, double b) {
        int celoyeChastnoe = (int) (a / b);
        double ostatok = a % b;
        System.out.println("Celoye chastnoye ot deleniya a na b ravno " + celoyeChastnoe + "; Ostatok ot deleniya a na b " +
                "raven " + ostatok);
    }
}

class Lesson8Test {
    public static void main(String[] args) {
        System.out.println(Lesson8.proizvedeniyeTrexChisel(2.6, 8.2, 10.8));
        System.out.println(Lesson8.proizvedeniyeTrexChisel(5, 4, 10));
        Lesson8.deleniyeDvuxChisel(11.58, 3.22);
        Lesson8.deleniyeDvuxChisel(57.892, 14.88);
    }
}
