package object_array2;

import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ü �迭: �迭�� ���Ұ� ��ü�� �迭
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		Employee e3 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		Employees employees = new Employees();
//		employees.empGroup // ��� ��� ���� (��ü �迭)

		employees.init();
		employees.displayEmployee();
		
		while(true) {
			System.out.println();
			System.out.println();
			printMenu();
			System.out.print("�޴� ����: ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				// Q1. ��ü �迭�� ���� (���)�� ������ ��� 
				employees.displayEmployee();
			}
			else if(choice == 2) {
				// Q2. ��������� ��å�� �Է¹޾� �ش� ��å�� ��������� ��� 
				System.out.print("�˻��� ��å�� �Է��Ͻÿ� : ");
				String positionInput = sc.next();
				employees.searchEmployeebyPosition(positionInput);
			}
			else if(choice == 3) {
				// Q3. ��������� �μ��� �Է¹޾� �ش� �μ��� ��������� ���
				System.out.print("�˻��� �μ��� �Է��Ͻÿ� : ");
				String departInput = sc.next();
				employees.searchEmployeebyDepart(departInput);
			}
			else if(choice == 4) {
				System.out.println("���α׷� ���� ...");
				break;
			}
		}
	}
	public static void printMenu() {
		System.out.println("===== �޴� =====");
		System.out.println("1. ��� ��� ���� ���");
		System.out.println("2. ��å���� �˻�");
		System.out.println("3. �μ��� �˻�");
		System.out.println("4. ����");
		System.out.println("==============");
	}
}
