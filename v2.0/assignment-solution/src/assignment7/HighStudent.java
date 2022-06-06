package assignment7;

public class HighStudent extends Student {

    public HighStudent() {}
    public HighStudent(String name) {
        super(name);
    }
    public HighStudent(String name, String studentNo, String grade) {
        super(name, studentNo, grade);
    }

    @Override
    public String toString() {
        return "HighStudent{" +
                "name='" + name + '\'' +
                ", studentNo='" + studentNo + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
