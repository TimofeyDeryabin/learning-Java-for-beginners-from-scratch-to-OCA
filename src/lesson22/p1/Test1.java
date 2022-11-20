package lesson22.p1;

import lesson22.Chelovek;

public class Test1 {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName(new StringBuilder("Kolya"));
        c.setVes(50);
        c.setVozrast(15);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());

    }
}
