package comparable_test;

import java.util.*;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Student, String> subject 
		= new TreeMap<>();
		
		// �̤�...
		subject.put
		(new Student(1, "���ڹ�", 4, 80), "����");
		subject.put
		(new Student(2, "��Ŭ��", 3, 90), "����");
		subject.put
		(new Student(3, "ȫ�浿", 2, 85), "����");
		subject.put
		(new Student(4, "ȫ���", 2, 85), "����");
		//System.out.println(subject);
		
		Set<Student> keySet = subject.keySet();
		for(Student s : keySet) {
			System.out.println(s + " : " + subject.get(s));
		}
		
		// 1.
		// ���� ������� (��������) ���
		// ���࿡ ������ �����ϴٸ� id ������� (��������) ���
		
		// 2.
		// �г� ������� (��������) ���
		// ���࿡ ������ �����ϴٸ� id ������� (��������) ���
	}

}
