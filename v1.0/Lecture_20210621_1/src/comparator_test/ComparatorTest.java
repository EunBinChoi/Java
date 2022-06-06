package comparator_test;

import java.util.*;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Student, String> subject1 
		= new TreeMap<>(); 
		// Comparable �������̽��� compareTo() �Լ��� ���ؼ� ����

		subject1.put
		(new Student(1, "���ڹ�", 4, 80), "����");
		subject1.put
		(new Student(2, "��Ŭ��", 3, 90), "����");
		subject1.put
		(new Student(3, "ȫ�浿", 2, 85), "����");
		subject1.put
		(new Student(4, "ȫ���", 2, 85), "����");
		//System.out.println(subject);
		
		System.out.println("[Comparable]");
		Set<Student> keySet = subject1.keySet();
		for(Student s : keySet) {
			System.out.println(s + " : " + subject1.get(s));
		}
		
		System.out.println();
		
		System.out.println("[GradeComparator]");
		TreeMap<Student, String> subject2
		= new TreeMap<>(new GradeComparator());
	
		subject2.put
		(new Student(1, "���ڹ�", 4, 80), "����");
		subject2.put
		(new Student(2, "��Ŭ��", 3, 90), "����");
		subject2.put
		(new Student(3, "ȫ�浿", 2, 85), "����");
		subject2.put
		(new Student(4, "ȫ���", 2, 85), "����");
		//System.out.println(subject);
		
		keySet = subject2.keySet();
		for(Student s : keySet) {
			System.out.println(s + " : " + subject2.get(s));
		}
		System.out.println();
		
		System.out.println("[ScoreComparator]");
		TreeMap<Student, String> subject3
		= new TreeMap<>(new ScoreComparator());
		
		// �̤�...
		subject3.put
		(new Student(1, "���ڹ�", 4, 80), "����");
		subject3.put
		(new Student(2, "��Ŭ��", 3, 90), "����");
		subject3.put
		(new Student(3, "ȫ�浿", 2, 85), "����");
		subject3.put
		(new Student(4, "ȫ���", 2, 85), "����");
		//System.out.println(subject);
		
		keySet = subject3.keySet();
		for(Student s : keySet) {
			System.out.println(s + " : " + subject3.get(s));
		}
		
		// 1.
		// ���� ������� (��������) ���
		// ���࿡ ������ �����ϴٸ� id ������� (��������) ���
		
		// 2.
		// �г� ������� (��������) ���
		// ���࿡ ������ �����ϴٸ� id ������� (��������) ���
	}

}
