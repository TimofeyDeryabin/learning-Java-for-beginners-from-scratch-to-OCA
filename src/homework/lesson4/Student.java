package homework.lesson4;

public class Student {

    short studentId;
    String name;
    String surname;
    byte godObucheniya;
    double sredOchenkaMath;
    double sredOchenkaEconom;
    double sredOchenkaInYazuk;
}

class StudentTest {

    double srednyayaArifmOcenka(Student st) {
        double srednyayaArifm = (st.sredOchenkaMath + st.sredOchenkaEconom + st.sredOchenkaInYazuk) / 3;
        System.out.println("Средняя арифметическая оценка студента: " + st.name + " равна: " + srednyayaArifm);
        return srednyayaArifm;
    }

    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.studentId = 1;
        st1.name = "Ivan";
        st1.surname = "Petrov";
        st1.godObucheniya = 2;
        st1.sredOchenkaMath = 3.85;
        st1.sredOchenkaEconom = 4.99;
        st1.sredOchenkaInYazuk = 4.32;

        st2.studentId = 2;
        st2.name = "Maksim";
        st2.surname = "Sidorov";
        st2.godObucheniya = 1;
        st2.sredOchenkaMath = 2.65;
        st2.sredOchenkaEconom = 3.45;
        st2.sredOchenkaInYazuk = 3.09;

        st3.studentId = 3;
        st3.name = "Semen";
        st3.surname = "Kruglov";
        st3.godObucheniya = 3;
        st3.sredOchenkaMath = 4.85;
        st3.sredOchenkaEconom = 4.44;
        st3.sredOchenkaInYazuk = 5.0;

        StudentTest s = new StudentTest();
        s.srednyayaArifmOcenka(st1);
        s.srednyayaArifmOcenka(st2);
        s.srednyayaArifmOcenka(st3);
    }
}
