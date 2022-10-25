package lesson9;

public class Car {

    final int XYZ = 3;
    int zssssssssss = 5;
    int _____$$$$Zvger_________$$$$$$eee = 10;
    boolean hjj = true;
    int String = 2;


    String color;
    public static int ab = 10;
    String engine;
    public static int count;

    public static void changeA(int b) {
        Car c = new Car("black", "V8");
        c.ab = b;
    }

    public Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void show_color() {
        System.out.println("Cvet mashini: " + color);
        changeColor("red");
    }

    public void changeColor(String color3) {
        System.out.println("Cvet mashini izmenilsya");
        int cena = 5000;
        color = color3;
        cena += 1000;
    }

    void abc(int a, int b) {

    }

    void abcd(int a, int b) {

    }

    void changeColor2(String color){
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        System.out.println(c.color);
        c.changeColor2("black");
        System.out.println(c.color);
    }
}
