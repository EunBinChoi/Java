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
			System.out.print("검색하고자 하는 부서를 입력하시오 (종료시 end) : ");
			String searchDepart = sc.next();
			if(searchDepart.equals("end")) break;
			searchEmployeebyDepart(empGroup, searchDepart);
			System.out.println();
			System.out.println();
	
			System.out.print("검색하고자 하는 직급를 입력하시오 (종료시 end) : ");
			String searchPosition = sc.next();
			if(searchPosition.equals("end")) break;
			searchEmployeebyPosition(empGroup, searchPosition);
			System.out.println();
			System.out.println();
		}

	}

	public static void initEmployee(Employee[] empGroup) {
		System.out.print("몇 명의 사원을 입력하시겠습니까? ");
		int num = sc.nextInt(); // 2 (enter)
		sc.nextLine(); // 버퍼에 잔류한 enter를 들고 옴 
		
		// 2
		// index: 0 1
		
		// 3
		// index: 0 1 2 3 4
		int currentEmpCount = Employee.getEmpCount();
		for (int i = currentEmpCount; i < currentEmpCount + num; i++) {

			empGroup[i] = new Employee(i + 1);
			System.out.println("============================================================");
			System.out.printf("           [%d번 직원 정보 입력]\n", empGroup[i].getEno());
			System.out.println();

			System.out.print("직원의 이름, 직급, 부서를 순서대로 입력해주세요 "
					+ "(ex) 홍길동 사원 개발팀) : ");
			
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
		System.out.println("           [ 사원 리스트 ]           ");
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
