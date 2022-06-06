package assignment8;

import javax.management.ConstructorParameters;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private int sno; // 학생 번호
    private String name; // 학생 이름
    private int score; // 학생 성적
    private int index; // 11번 문제 PriorityQueue 삽입 순서 유지를 위함
    private static int count = 0; // 11번 문제 PriorityQueue 삽입 순서 유지를 위해 객체수를 저장하기 위함

    public Student() {
        index = Student.count;
        Student.count++;
    }

    public Student(int sno) {
        this.sno = sno;

        index = Student.count;
        Student.count++;
    }

    public Student(String name) {
        this.name = name;

        index = Student.count;
        Student.count++;
    }

    public Student(int sno, String name, int score) {
        this.sno = sno;
        this.name = name;
        this.score = score;

        index = Student.count;
        Student.count++;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sno == student.sno && score == student.score && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return sno;
    }


    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(getSno(), o.getSno());
    }
}
