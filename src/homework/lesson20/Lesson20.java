package homework.lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson20 {
    public static ArrayList<String> abc(String ... s) {
        ArrayList<String> list = new ArrayList<>();
        for (String s1 : s) {
            list.add(s1);
        }
//        for (String s3 : s) {
//            if (!list.contains(s3)) {
//                list.add(s3);
//            }
//        }
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).equals(list.get(i))) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        abc("ok", "privet", "poka", "ok", "poka", "poka", "9", "Andrey", "3");
    }
}
