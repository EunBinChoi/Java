package object_array3;

import java.util.Scanner;

public class Employees {
	private static Scanner sc = new Scanner(System.in);
	private Employee[] empGroup;
	private int numOfEmployees;

	public Employees(int numOfEmployees) {
		empGroup = new Employee[numOfEmployees];
	}

	public void init() {
		// �迭 ���� (��ü) ����
		for (int i = 0; i < empGroup.length; i++) {
			empGroup[i] = new Employee(i + 1);
		}
	}

	public void inputUser() {
		// ��ü �迭�� ���Ҹ� �ʱ�ȭ (����� �Է�)
		for (int i = 0; i < empGroup.length; i++) {
			System.out.printf("[�����ȣ: %d]�� �̸�, ��å, �μ��� �Է� : ", empGroup[i].getEno());
			empGroup[i].setName(sc.next());
			empGroup[i].setPosition(sc.next());
			empGroup[i].setDepart(sc.next());
		}
	}

	public Employee[] getEmpGroup() {
		return empGroup;
	}

	public void setEmpGroup(Employee[] empGroup) {
		this.empGroup = empGroup;
	}

	public int getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(int numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}

	// ��� ������� display�Ѵ�.
	public void display() {
		for (int i = 0; i < empGroup.length; i++) {
			System.out.println(empGroup[i]); // �ּҰ� -> toString()�� ���ǵ� ���ڿ� ���
		}
	}

	// ��� ������� �˻��ϸ鼭 �˻��ϰ��� �ϴ� position�� �´� ����� ����Ѵ�.
	public Employees searchbyPosition(String positionInput) {
		int count = 0;
		// �˻��ϰ��� �ϴ� position�� �´� ��� �� Ȯ��
		for (int i = 0; i < empGroup.length; i++) {
			if (empGroup[i].getPosition().equals(positionInput)) {
				count++;
			}
		}

		Employees searchPos = new Employees(count); // �˻� ����� ���� �迭
		searchPos.init();
		int searchPosIdx = 0; // �˻� ����� �����ϴ� �迭 �ε��� (searchPos)
		for (int i = 0; i < empGroup.length; i++) {
			if (empGroup[i].getPosition().equals(positionInput)) {
				searchPos.empGroup[searchPosIdx++] = empGroup[i];
			}
		}
		return searchPos;
	}

	// ��� ������� �˻��ϸ鼭 �˻��ϰ��� �ϴ� department�� �´� ����� ����Ѵ�.
	public Employees searchbyDepart(String departInput) {
		int count = 0;
		// �˻��ϰ��� �ϴ� department�� �´� ��� �� Ȯ��
		for (int i = 0; i < empGroup.length; i++) {
			if (empGroup[i].getDepart().equals(departInput)) {
				count++;
			}
		}

		Employees searchDepart = new Employees(count);
		searchDepart.init();
		int searchDepartIdx = 0;
		for (int i = 0; i < empGroup.length; i++) {
			if (empGroup[i].getDepart().equals(departInput)) {
				searchDepart.empGroup[searchDepartIdx++] = empGroup[i];
			}
		}
		return searchDepart;
	}
}
