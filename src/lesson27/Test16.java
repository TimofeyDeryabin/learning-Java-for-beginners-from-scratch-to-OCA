package lesson27;

import java.util.*;

public class Test16 {
    static Doctor[] array = new Doctor[4];

    public static void createPwd(String pwd) {
        if (pwd.length() < 6) {
            throw new IllegalArgumentException("Dlina parolya slishkom malenkaya");
        }
        if (pwd.length() > 12) {
            throw new IllegalArgumentException("Dlina parolya slishkom bolshaya");
        }
        System.out.println("parol prinyat");
    }
    public static void main(String[] args) {
//        ArrayList<String> list;
//        list.add("1");
//        list.add("2");
//        System.out.println(list.get(3));
//        System.out.println(5 / 0);
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Teacher t3 = new Teacher();
//        Teacher[] array2 = {t, t3};
//        Employee[] array1 = {d, t};
//        Teacher t2 = (Teacher) array1[0];
//        Doctor d2 = (Doctor) array2[0];
//        createPwd("qwerty");
//        list.add("!!!");
        System.out.println(array[0]);
    }
}

class Employee {}

class Doctor extends Employee {}

class Teacher extends Employee {}

//class Samolet {
//    String sostoyanie = "v ojidanii"; // v ojidanii, v vozduxe, polet otmenen
//
//    public void letet() {
//        sostoyanie = "v vozduxe";
//        System.out.println("Samolet letit");
//    }
//
//    public void ojidat() {
//        if (sostoyanie == "v vozduxe") {
//            throw new IllegalStateException("Samolet uje v vozduxe");
//        }
//        sostoyanie = "v ojidanii";
//        System.out.println("Samolet v ojidanii poleta");
//    }
//
//    public void otmenitPolet() {
//        if (sostoyanie == "v vozduxe") {
//            throw new IllegalStateException("Samolet uje v vozduxe");
//        }
//        sostoyanie = "polet otmenen";
//        System.out.println("Polet samoleta otmenen");
//    }
//
//    public static void main(String[] args) {
//        Samolet s = new Samolet();
//        s.ojidat();
//        s.letet();
//        s.otmenitPolet();
//    }
//}