package lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(1, new StringBuilder("hello"));
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();
//        list.set(1, "!!!");
//        list.remove("poka");
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));
        list.addAll(list2);
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();
//        list2.set(1, "Ivanov");
        list2.get(1).append("!");
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();
//        list.clear();
//        for (StringBuilder sb : list) {
//            System.out.print(sb + " ");
//        }
//        System.out.println();

    }
}
