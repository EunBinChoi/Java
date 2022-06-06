package object_array2;

import java.util.Scanner;

public class Employees {
	Scanner sc = new Scanner(System.in);
	Employee[] empGroup = new Employee[3];
	
	public void init() { // initialize
		// 배열 원소 (객체) 생성
		for (int i = 0; i < empGroup.length; i++) {
			empGroup[i] = new Employee(i + 1);
			// eno: 1, 2, 3
			empGroup[i] = new Employee();
			// eno: 0, 0, 0
		}

		// 객체 배열의 원소를 초기화 (사용자 입력)
		for (int i = 0; i < empGroup.length; i++) {
			System.out.printf("[사원번호: %d]의 이름, 직책, 부서를 입력 : ", empGroup[i].getEno());
			empGroup[i].setName(sc.next());
			empGroup[i].setPosition(sc.next());
			empGroup[i].setDepart(sc.next());
		}
	}

	// 모든 사원들을 display한다.
	public void displayEmployee() {
		for (int i = 0; i < empGroup.length; i++) {
			System.out.println(empGroup[i]); // 주소값 -> toString()에 정의된 문자열 출력
		}
	}

	// 모든 사원들을 검색하면서 검색하고자 하는 position과 맞는 사원을 출력한다.
	public void searchEmployeebyPosition(String positionInput) {
		for (int i = 0; i < empGroup.length; i++) {
			if (empGroup[i].getPosition().equals(positionInput)) {
				System.out.println(empGroup[i]);
			}
		}
	}

	// 모든 사원들을 검색하면서 검색하고자 하는 department과 맞는 사원을 출력한다.
	public void searchEmployeebyDepart(String departInput) {
		for (int i = 0; i < empGroup.length; i++) {
			if (empGroup[i].getDepart().equals(departInput)) {
				System.out.println(empGroup[i]);
			}
		}
	}
}
