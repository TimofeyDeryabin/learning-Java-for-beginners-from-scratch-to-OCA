package lesson27;

public class Test2 {
    void abc() {
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 0};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Isklucheniye poymano");
        }

    }
}
