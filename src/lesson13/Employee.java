package lesson13;

public class Employee {
    public static void main(String[] args) {

        int denNedeli = 1;

        switch (denNedeli) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Rabota do 18:00");
                break;
            case 6:
                System.out.println("Rabota do 14:00");
                break;
            case 7:
                System.out.println("Raboti net");
                break;
            default:
                System.out.println("Takogo dnya ne sushestvuet");
        }
    }
}
