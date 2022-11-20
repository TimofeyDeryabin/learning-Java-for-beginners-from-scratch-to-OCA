package homework.lesson22;

public class Student {
    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder sb) {
        if (sb.length() > 2) {
            name = sb;
        }
    }

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int i) {
        if (i > 0 && i < 5) {
            course = i;
        }
    }

    private int grade;
    public int getGrade() {
        return grade;
    }
    public void setGrade(int i) {
        if (i > 0 && i < 11) {
            grade = i;
        }
    }

    public void showInfo() {
        System.out.println("Imya studenta: " + getName() + "; Kurs obucheniya: " + getCourse() + "; Ocenka: " + getGrade() + ";");
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName(new StringBuilder("Ivan"));
        st.setCourse(3);
        st.setGrade(8);
        st.showInfo();
    }
}