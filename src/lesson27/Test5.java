package lesson27;

public class Test5 {
    static void abc() {
        System.out.println("rabotaet method abc");
        abc();
    }

    public static void main(String[] args) {
        abc();
    }
}
