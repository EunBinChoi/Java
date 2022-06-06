package object_compare;

import java.util.Arrays;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "ȫ�浿", "���", "������");
		Employee e2 = new Employee(2, "�ڹڹ�", "���", "������");
		Employee e0 = new Employee(0, "�ڱ��", "���", "������");
		Employee[] e = {e1, e2, e0};
		System.out.println(e[0] == e1);
		
//		System.out.println(e1 > e2); // �����ڷδ� ��ü �� �Ұ�
		
		/* ��ü ��
		 * 1) Comparable �������̽� ���� compareTo() ����
		 * 2) Comparator �������̽� ���� compare() ����
		 * */
		int c = e1.compareTo(e2);
		System.out.println(c);
		
		////////////////////////////////////////////////
		// 1) Comparable
		// �̹� ��ü�� �˰� �ִ� Comparable ��� (compareTo())���� ����
		// => Employee implements Comparable (���� �Ǿ�����)		
		Arrays.sort(e); 
		
		// sort(): �⺻�� �������� ����
		// -1: �״��
		// 0: �� �Ұ�
		// 1: ��ġ ���� (swap)
		
		// for-each��
		for(Employee emp : e) {
			System.out.println(emp);
		}
		System.out.println();
		
		////////////////////////////////////////////////
		// 2) Comparator
		// ��ü�� �𸣴� ���ο� ���� ����� �����ϴ� Comparator ��� (compare())���� ����
		// Q1. �̸� �������� �� (s1.compareTo(s2))
		Arrays.sort(e, new EmployeeNameComparator()); 
		for(Employee emp : e) {
			System.out.println(emp);
		}
		System.out.println();
		
		// Q2. 1) �����ȣ 2) �̸� (�����ȣ�� ������)
		Employee ec1 = new Employee(0, "ȫ�浿", "���", "������");
		Employee ec2 = new Employee(2, "�ڹڹ�", "���", "������");
		Employee ec0 = new Employee(0, "�ڱ��", "���", "������");
		Employee[] ec = {ec1, ec2, ec0};
		Arrays.sort(ec, new EmployeeEnoNameComparator()); 
		for(Employee emp : ec) {
			System.out.println(emp);
		}
		System.out.println();
		
		// Q3. �����ȣ �������� �����ϴ� EmployeeEnobyDecComparator
		Employee ecd1 = new Employee(1, "ȫ�浿", "���", "������");
		Employee ecd2 = new Employee(2, "�ڹڹ�", "���", "������");
		Employee ecd0 = new Employee(0, "�ڱ��", "���", "������");
		Employee[] ecd = {ecd1, ecd2, ecd0};
		Arrays.sort(ecd, new EmployeeEnobyDecComparator()); 
		for(Employee emp : ecd) {
			System.out.println(emp);
		}
	}

}
