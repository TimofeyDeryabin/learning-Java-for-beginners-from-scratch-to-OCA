package homework.lesson19;

public class Lesson19 {
    public String[] abc(String[] ... array) {
        int n = 0;
        for (String[] s : array) {
            n += s.length;
        }
        String[] result = new String[n];
        for (int i = 0, j = 0; i < result.length && j < array.length; j++) {
            for (String s1 : array[j]) {
                result[i] = s1;
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Lesson19 L19 = new Lesson19();
        String[] array1 = {"hello", "privet", "ok", "semya"};
        String[] array2 = {"one", "two", "three"};
        String[] array3 = {"1", "2", "3", "4", "5"};
        String[] s = L19.abc(array1, array2, array3);
        for (String s1 : s) {
            System.out.print(s1 + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            for (String s2 : args) {
                if (s2.equals(s[i])) {
                    s[i] = null;
                }
            }
        }
        for (String s1 : s) {
            System.out.print(s1 + " ");
        }
        System.out.println();
        System.out.println();
    }
}
