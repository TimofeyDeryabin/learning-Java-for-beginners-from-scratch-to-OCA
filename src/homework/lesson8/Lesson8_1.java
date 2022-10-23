package homework.lesson8;

public class Lesson8_1 {
    static final double PI = 3.14;

    public double ploshadKruga(double r) {
        double sKruga = PI * r * r;
        return sKruga;
    }

    public static double dlinaOkrujnosti(double r) {
        double dlOkrujnosti = 2 * PI * r;
        return dlOkrujnosti;
    }

    public void showInfo(double r){
        System.out.println("Radius okrujnosti raven " + r);
        System.out.println("Ploshad kruga s diametrom r ravna " + ploshadKruga(r));
        System.out.println("Dlina okrujnosti s diametrom r ravna " + dlinaOkrujnosti(r));
    }
}

class Lesson8_1Test {
    public static void main(String[] args) {
        Lesson8_1 l = new Lesson8_1();
        System.out.println("Ploshad kruga ravna " + l.ploshadKruga(5.46));
        System.out.println("Dlina okrujnosti ravna " + Lesson8_1.dlinaOkrujnosti(5.46));
        l.showInfo(5.46);
    }
}
