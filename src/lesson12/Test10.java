package lesson12;

public class Test10 {

    void maximum(int i1, int i2, int i3){
        if (i1 > i2 && i1 > i3) {
            int a = 5;
            System.out.println("Maximum - " + i1);
        } else if (i2 > i1 && i2 > i3) {
//            a = 10;
            System.out.println("Maximum - " + i2);
        } else {
            System.out.println("Maximum - " + i3);
        }
    }

    void abc(){
        String str;
        int a = 10;
        if (a >= 10) {
            str = "Privet";
        }
        if (a < 10){
            str = "Poka";
        } else {
            str = null;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
//        int salary = 1500;
//        boolean b = true;
//
//        if (salary < 200) {
//            System.out.println("Z/P ochen nizka");
//        } else if (salary < 400 && b == false || !true) {
//            System.out.println("Z/P srednego razmera");
//        } else if (b = true) {
//            System.out.println("Z/P visokaya");
//        }

        Test10 t = new Test10();
        t.maximum(4, 7, 0);

        int a = 10;
        int b = 20;
        int maximum = (a > b) ? a : b;
        System.out.println(maximum);
    }
}
