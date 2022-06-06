package object_array;

import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ��ü �迭: �迭�� ���Ұ� ��ü�� �迭
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		Employee e3 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		// �迭 ����
		Employee[] empGroup = new Employee[3];
		
		// �迭 ���� (��ü) ����
		for(int i = 0; i < empGroup.length; i++) {
			empGroup[i] = new Employee(i + 1);
		}
		
		// ��ü �迭�� ���Ҹ� �ʱ�ȭ (����� �Է�)
		for(int i = 0; i < empGroup.length; i++) {
			System.out.printf("[�����ȣ: %d]�� �̸�, ��å, �μ��� �Է� : ", 
					empGroup[i].getEno());
			empGroup[i].setName(sc.next());
			empGroup[i].setPosition(sc.next());
			empGroup[i].setDepart(sc.next());
		}
		
		while(true) {
			System.out.println();
			System.out.println();
			System.out.println("===== �޴� =====");
			System.out.println("1. ��� ��� ���� ���");
			System.out.println("2. ��å���� �˻�");
			System.out.println("3. �μ��� �˻�");
			System.out.println("4. ����");
			System.out.println("==============");
			System.out.print("�޴� ����: ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				// Q1. ��ü �迭�� ���� (���)�� ������ ��� 
				displayEmployee(empGroup);
			}
			else if(choice == 2) {
				// Q2. ��������� ��å�� �Է¹޾� �ش� ��å�� ��������� ��� 
				System.out.print("�˻��� ��å�� �Է��Ͻÿ� : ");
				String positionInput = sc.next();
				searchEmployeebyPosition(empGroup, positionInput);
			}
			else if(choice == 3) {
				// Q3. ��������� �μ��� �Է¹޾� �ش� �μ��� ��������� ���
				System.out.print("�˻��� �μ��� �Է��Ͻÿ� : ");
				String departInput = sc.next();
				searchEmployeebyDepart(empGroup, departInput);
			}
			else if(choice == 4) {
				System.out.println("���α׷� ���� ...");
				break;
			}
		}
	}
	
	// ��� ������� display�Ѵ�.
	public static void displayEmployee(Employee[] empGroup) {
		for(int i = 0; i < empGroup.length; i++) {
			System.out.println(empGroup[i]); // �ּҰ� -> toString()�� ���ǵ� ���ڿ� ���
		}
	}
	// ��� ������� �˻��ϸ鼭 �˻��ϰ��� �ϴ� position�� �´� ����� ����Ѵ�.
	public static void searchEmployeebyPosition(Employee[] empGroup, String positionInput) {
		for(int i = 0; i < empGroup.length; i++) {
			if(empGroup[i].getPosition().equals(positionInput)) {
				System.out.println(empGroup[i]);
			}
		}
	}
	// ��� ������� �˻��ϸ鼭 �˻��ϰ��� �ϴ� department�� �´� ����� ����Ѵ�.
	public static void searchEmployeebyDepart(Employee[] empGroup, String departInput) {
		for(int i = 0; i < empGroup.length; i++) {
			if(empGroup[i].getDepart().equals(departInput)) {
				System.out.println(empGroup[i]);
			}
		}
	}
	

}
