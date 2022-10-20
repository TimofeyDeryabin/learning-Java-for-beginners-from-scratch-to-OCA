package homework.lesson4;

public class Student {

    Student(short studentId, String name, String surname, byte godObucheniya, double sredOchenkaMath, double sredOchenkaEconom,
            double sredOchenkaInYazuk) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.godObucheniya = godObucheniya;
        this.sredOchenkaMath = sredOchenkaMath;
        this.sredOchenkaEconom = sredOchenkaEconom;
        this.sredOchenkaInYazuk = sredOchenkaInYazuk;
    }

    Student(short studentId, String name, String surname, byte godObucheniya) {
        this(studentId, name, surname, godObucheniya, 0.0, 0.0,
                0.0);
    }

    Student() {

    }

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

        Student st4 = new Student((short) 4, "Igor", "Kolmykov", (byte) 5, 5.75, 3.52,
                6.83);
        Student st5 = new Student((short) 5, "Vanya", "Frolov", (byte) 3);

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
