package employee_problem;

import java.util.Scanner;

public class EmployeTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] empGroup = new Employee[10];
	
		while(true) {	
			initEmployee(empGroup);
			displayEmployee(empGroup);

			System.out.println();
			System.out.print("�˻��ϰ��� �ϴ� �μ��� �Է��Ͻÿ� (����� end) : ");
			String searchDepart = sc.next();
			if(searchDepart.equals("end")) break;
			searchEmployeebyDepart(empGroup, searchDepart);
			System.out.println();
			System.out.println();
	
			System.out.print("�˻��ϰ��� �ϴ� ���޸� �Է��Ͻÿ� (����� end) : ");
			String searchPosition = sc.next();
			if(searchPosition.equals("end")) break;
			searchEmployeebyPosition(empGroup, searchPosition);
			System.out.println();
			System.out.println();
		}

	}

	public static void initEmployee(Employee[] empGroup) {
		System.out.print("�� ���� ����� �Է��Ͻðڽ��ϱ�? ");
		int num = sc.nextInt(); // 2 (enter)
		sc.nextLine(); // ���ۿ� �ܷ��� enter�� ��� �� 
		
		// 2
		// index: 0 1
		
		// 3
		// index: 0 1 2 3 4
		int currentEmpCount = Employee.getEmpCount();
		for (int i = currentEmpCount; i < currentEmpCount + num; i++) {

			empGroup[i] = new Employee(i + 1);
			System.out.println("============================================================");
			System.out.printf("           [%d�� ���� ���� �Է�]\n", empGroup[i].getEno());
			System.out.println();

			System.out.print("������ �̸�, ����, �μ��� ������� �Է����ּ��� "
					+ "(ex) ȫ�浿 ��� ������) : ");
			
			String info = sc.nextLine();
			String[] splitInfo = info.split(" ");

			//System.out.println(splitInfo.length);
			empGroup[i].setName(splitInfo[0]);
			empGroup[i].setPosition(splitInfo[1]);
			empGroup[i].setDepartment(splitInfo[2]);


			System.out.println("============================================================");
			System.out.println();
			
		}
	}

	public static void displayEmployee(Employee[] empGroup) {
		System.out.println("============================================================");
		System.out.println("           [ ��� ����Ʈ ]           ");
		for (int i = 0; i < Employee.getEmpCount(); i++) {
			System.out.println(empGroup[i]);
		}
		System.out.println("============================================================");
		System.out.println();
	}

	public static void searchEmployeebyDepart(Employee[] empGroup, 
			String department) {

		for (int i = 0; i < Employee.getEmpCount(); i++) {
			if (empGroup[i].getDepartment().equals(department)) {
				System.out.println(empGroup[i]);
			}
		}
	}

	public static void searchEmployeebyPosition(Employee[] empGroup, 
			String position) {

		for (int i = 0; i < Employee.getEmpCount(); i++) {
			if (empGroup[i].getPosition().equals(position)) {
				System.out.println(empGroup[i]);
			}
		}
	}

}
