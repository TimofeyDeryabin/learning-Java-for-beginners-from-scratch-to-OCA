package homework.lesson17;

public class Lesson17 {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                char c1 = sb1.charAt(i);
                char c2 = sb2.charAt(i);
                if (c1 != c2) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean ravenstvo2(StringBuilder sb1, StringBuilder sb2) {
        String s1 = sb1.substring(0, sb1.length());
        String s2 = sb2.substring(0, sb2.length());
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello friend!");
        StringBuilder sb2 = new StringBuilder("Hello friend!");
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        System.out.println(ravenstvo(sb1, sb2));
        System.out.println(ravenstvo(sb3, sb4));

        System.out.println(ravenstvo2(sb1, sb2));
        System.out.println(ravenstvo2(sb3, sb4));
    }
}
