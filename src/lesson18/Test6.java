package lesson18;

public class Test6 {
    public static void maxMin(double[] array) {
        double min = array[0];
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimalniy element massiva: " + min);
        System.out.println("Maksimalniy element massiva: " + max);
    }
}

class Test6Test {
    public static void main(String[] args) {
        double[] array = {2, -1, 7.0097, 4.71, 0.0, 0.8104, 12.23472, -127.98};
        Test6.maxMin(array);
    }
}
