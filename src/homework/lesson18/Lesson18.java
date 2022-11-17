package homework.lesson18;

import java.util.ArrayList;

public class Lesson18 {
    public static int[] sortirovka(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static int[] sortirovka2(int[] array) {
        int[] array2 = new int[array.length];
        ArrayList<Integer> aL = new ArrayList<>();
        for (int a = 0; a < array.length; a++) {
            aL.add(a);
        }
        for (int i = 0; i < array.length; i++) {
            int a = aL.get(0);
            int min = array[a];
            int index = a;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < min && aL.contains(j) == true) {
                    min = array[j];
                    index = j;
                }
            }
            if (index != a) {
                array2[i] = array[index];
                Integer in = index;
                aL.remove(in);
            } else {
                array2[i] = array[a];
                Integer in = a;
                aL.remove(in);
            }
        }
        return array2;
    }

    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j + 1 != array[i].length) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i + 1 != array.length) {
                System.out.print(", ");
            }
        }
        System.out.print(" }");
    }

    public static void main(String[] args) {
        int[] array = {1, 3, -7, 9, 14, 0, -10, -10};

        int[] array3 = sortirovka2(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        sortirovka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        String[][] array2 = new String[5][];
        array2[0] = new String[]{"ok", "privet", "hello"};
        array2[1] = new String[]{"hi", "drug"};
        array2[2] = new String[]{"utro", "semya", "kollega", "rabota"};
        array2[3] = new String[]{"da", "net", "ne znayu"};
        array2[4] = new String[]{"1", "3", "7", "0"};
        showArray(array2);
    }
}
