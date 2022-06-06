package assignment7;

public class UnivStudent extends Student {
    public UnivStudent() {}

    public UnivStudent(String name) {
        super(name);
    }

    public UnivStudent(String name, String studentNo, String grade) {
        super(name, studentNo, grade);
    }

    @Override
    public String toString() {
        return "UnivStudent{" +
                "name='" + name + '\'' +
                ", studentNo='" + studentNo + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

}
