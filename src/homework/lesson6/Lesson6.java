package homework.lesson6;

public class Lesson6 {

    int sum(){
        System.out.println("Сумма введенных целых чисел равна: 0");
        return 0;
    }

    int sum(int a){
        System.out.println("Сумма введенных целых чисел равна: " + a);
        return a;
    }

    int sum(int a, int b){
        int summa = a + b;
        System.out.println("Сумма введенных целых чисел равна: " + summa);
        return summa;
    }

    int sum(int a, int b, int c){
        int summa = a + b + c;
        System.out.println("Сумма введенных целых чисел равна: " + summa);
        return summa;
    }

    int sum(int a, int b, int c, int d){
        int summa = a + b + c + d;
        System.out.println("Сумма введенных целых чисел равна: " + summa);
        return summa;
    }
}

class Lesson6Test{
    public static void main(String[] args) {

        Lesson6 L6 = new Lesson6();
        L6.sum();
        L6.sum(2);
        L6.sum(3, 5);
        L6.sum(7,3, 9);
        L6.sum(1, 4, 8, 5);
    }
}
