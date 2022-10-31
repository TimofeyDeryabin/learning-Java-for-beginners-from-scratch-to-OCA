package homework.lesson11;

public class Car {
    String color;
    String engine;
    int kolDverey;

    Car(String color, String engine, int kolDverey) {
        this.color = color;
        this.engine = engine;
        this.kolDverey = kolDverey;
    }
}

class CarTest {
    public void changeKolDverey(Car c, int kolDverey){
        c.kolDverey = kolDverey;
    }

    public void changeColor(Car c1, Car c2){
        String cvet = c1.color;
        c1.color = c2.color;
        c2.color = cvet;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car c1 = new Car("black", "V4", 4);
        Car c2 = new Car("red", "V8", 5);
        ct.changeKolDverey(c1, 6);
        ct.changeColor(c1, c2);

        System.out.println("Cvet c1: " + c1.color + "; Motor c1: " + c1.engine + "; kolDverey c1: " + c1.kolDverey + ";");
        System.out.println("Cvet c2: " + c2.color + "; Motor c2: " + c2.engine + "; kolDverey c2: " + c2.kolDverey + ";");
    }
}