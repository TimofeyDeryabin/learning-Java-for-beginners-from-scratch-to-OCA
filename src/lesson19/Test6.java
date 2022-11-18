package lesson19;

public class Test6 {
    public static void main(String[] args) {
        int[][] array = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
        }
    }
}
