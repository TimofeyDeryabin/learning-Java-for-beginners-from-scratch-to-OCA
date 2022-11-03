package homework.lesson13;

public class Month {
    public void dniMesyaca(int a) {
        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("V etom mesyace 31 den");
                break;
            case 2:
                System.out.println("V etom mesyace 28 dney");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("V etom mesyace 30 dney");
                break;
            default:
                System.out.println("Takogo mesyaca ne sushestvuet");
        }
    }

    public static void main(String[] args) {
        Month m = new Month();
        m.dniMesyaca(12);
    }
}
