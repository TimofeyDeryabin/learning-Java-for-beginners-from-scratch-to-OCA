package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));

        ArrayList<String> list2 = new ArrayList<>(30);
        ArrayList<String> list5 = new ArrayList<>(list2);
        System.out.println(list2 == list5);
        list2.add("poka");
        list2.add("ok");
        ArrayList<StringBuilder> list3 = new ArrayList<>();
        List<StringBuilder> list4 = new ArrayList<>();
        list4.add(new StringBuilder("ok"));
    }
}

class Car {
}

class Student {
}
