package homework.lesson14;

public class Lesson14 {
    public static void time() {
        CHAS:
        for (int chas = 0; chas <= 6; chas++) {
            MINUTA:
            for (int minuta = 0; minuta <= 59; minuta++) {
                if (chas > 1 && minuta % 10 == 0 && minuta != 0) {
                    break CHAS;
                }
                SEKUNDA:
                for (int sekunda = 0; sekunda <= 59; sekunda++) {
                    if (sekunda * chas > minuta) {
                        continue MINUTA;
                    }
                    System.out.println(chas + ":" + minuta + ":" + sekunda);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
