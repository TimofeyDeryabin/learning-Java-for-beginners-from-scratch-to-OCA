package lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add("poka");
        list.add("hello");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.lastIndexOf("poka"));
        System.out.println(list.size());
//        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.contains("poka"));
        System.out.println(list.toString());
    }
}
