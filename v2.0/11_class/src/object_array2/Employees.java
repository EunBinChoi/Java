package object_array2;

import java.util.Scanner;

public class Employees {
	Scanner sc = new Scanner(System.in);
	Employee[] empGroup = new Employee[3];
	
	public void init() { // initialize
		// �迭 ���� (��ü) ����
		for (int i = 0; i < empGroup.length; i++) {
			empGroup[i] = new Employee(i + 1);
			// eno: 1, 2, 3
			empGroup[i] = new Employee();
			// eno: 0, 0, 0
		}

		// ��ü �迭�� ���Ҹ� �ʱ�ȭ (����� �Է�)
		for (int i = 0; i < empGroup.length; i++) {
			System.out.printf("[�����ȣ: %d]�� �̸�, ��å, �μ��� �Է� : ", empGroup[i].getEno());
			empGroup[i].setName(sc.next());
			empGroup[i].setPosition(sc.next());
			empGroup[i].setDepart(sc.next());
		}
	}

	// ��� ������� display�Ѵ�.
	public void displayEmployee() {
		for (int i = 0; i < empGroup.length; i++) {
			System.out.println(empGroup[i]); // �ּҰ� -> toString()�� ���ǵ� ���ڿ� ���
		}
	}

	// ��� ������� �˻��ϸ鼭 �˻��ϰ��� �ϴ� position�� �´� ����� ����Ѵ�.
	public void searchEmployeebyPosition(String positionInput) {
		for (int i = 0; i < empGroup.length; i++) {
			if (empGroup[i].getPosition().equals(positionInput)) {
				System.out.println(empGroup[i]);
			}
		}
	}

	// ��� ������� �˻��ϸ鼭 �˻��ϰ��� �ϴ� department�� �´� ����� ����Ѵ�.
	public void searchEmployeebyDepart(String departInput) {
		for (int i = 0; i < empGroup.length; i++) {
			if (empGroup[i].getDepart().equals(departInput)) {
				System.out.println(empGroup[i]);
			}
		}
	}
}
