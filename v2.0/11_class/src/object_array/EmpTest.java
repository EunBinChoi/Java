package object_array;

import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 객체 배열: 배열의 원소가 객체인 배열
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		Employee e3 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		// 배열 생성
		Employee[] empGroup = new Employee[3];
		
		// 배열 원소 (객체) 생성
		for(int i = 0; i < empGroup.length; i++) {
			empGroup[i] = new Employee(i + 1);
		}
		
		// 객체 배열의 원소를 초기화 (사용자 입력)
		for(int i = 0; i < empGroup.length; i++) {
			System.out.printf("[사원번호: %d]의 이름, 직책, 부서를 입력 : ", 
					empGroup[i].getEno());
			empGroup[i].setName(sc.next());
			empGroup[i].setPosition(sc.next());
			empGroup[i].setDepart(sc.next());
		}
		
		while(true) {
			System.out.println();
			System.out.println();
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 모든 사원 정보 출력");
			System.out.println("2. 직책으로 검색");
			System.out.println("3. 부서로 검색");
			System.out.println("4. 종료");
			System.out.println("==============");
			System.out.print("메뉴 선택: ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				// Q1. 객체 배열의 원소 (사원)의 정보를 출력 
				displayEmployee(empGroup);
			}
			else if(choice == 2) {
				// Q2. 사용자한테 직책을 입력받아 해당 직책의 사원정보를 출력 
				System.out.print("검색할 직책을 입력하시오 : ");
				String positionInput = sc.next();
				searchEmployeebyPosition(empGroup, positionInput);
			}
			else if(choice == 3) {
				// Q3. 사용자한테 부서를 입력받아 해당 부서의 사원정보를 출력
				System.out.print("검색할 부서를 입력하시오 : ");
				String departInput = sc.next();
				searchEmployeebyDepart(empGroup, departInput);
			}
			else if(choice == 4) {
				System.out.println("프로그램 종료 ...");
				break;
			}
		}
	}
	
	// 모든 사원들을 display한다.
	public static void displayEmployee(Employee[] empGroup) {
		for(int i = 0; i < empGroup.length; i++) {
			System.out.println(empGroup[i]); // 주소값 -> toString()에 정의된 문자열 출력
		}
	}
	// 모든 사원들을 검색하면서 검색하고자 하는 position과 맞는 사원을 출력한다.
	public static void searchEmployeebyPosition(Employee[] empGroup, String positionInput) {
		for(int i = 0; i < empGroup.length; i++) {
			if(empGroup[i].getPosition().equals(positionInput)) {
				System.out.println(empGroup[i]);
			}
		}
	}
	// 모든 사원들을 검색하면서 검색하고자 하는 department과 맞는 사원을 출력한다.
	public static void searchEmployeebyDepart(Employee[] empGroup, String departInput) {
		for(int i = 0; i < empGroup.length; i++) {
			if(empGroup[i].getDepart().equals(departInput)) {
				System.out.println(empGroup[i]);
			}
		}
	}
	

}
