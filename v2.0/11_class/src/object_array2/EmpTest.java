package object_array2;

import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 배열: 배열의 원소가 객체인 배열
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		Employee e3 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		Employees employees = new Employees();
//		employees.empGroup // 모든 사원 정보 (객체 배열)

		employees.init();
		employees.displayEmployee();
		
		while(true) {
			System.out.println();
			System.out.println();
			printMenu();
			System.out.print("메뉴 선택: ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				// Q1. 객체 배열의 원소 (사원)의 정보를 출력 
				employees.displayEmployee();
			}
			else if(choice == 2) {
				// Q2. 사용자한테 직책을 입력받아 해당 직책의 사원정보를 출력 
				System.out.print("검색할 직책을 입력하시오 : ");
				String positionInput = sc.next();
				employees.searchEmployeebyPosition(positionInput);
			}
			else if(choice == 3) {
				// Q3. 사용자한테 부서를 입력받아 해당 부서의 사원정보를 출력
				System.out.print("검색할 부서를 입력하시오 : ");
				String departInput = sc.next();
				employees.searchEmployeebyDepart(departInput);
			}
			else if(choice == 4) {
				System.out.println("프로그램 종료 ...");
				break;
			}
		}
	}
	public static void printMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 모든 사원 정보 출력");
		System.out.println("2. 직책으로 검색");
		System.out.println("3. 부서로 검색");
		System.out.println("4. 종료");
		System.out.println("==============");
	}
}
