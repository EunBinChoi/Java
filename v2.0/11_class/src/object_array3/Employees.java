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
		// 배열 원소 (객체) 생성
		for (int i = 0; i < empGroup.length; i++) {
			empGroup[i] = new Employee(i + 1);
		}
	}

	public void inputUser() {
		// 객체 배열의 원소를 초기화 (사용자 입력)
		for (int i = 0; i < empGroup.length; i++) {
			System.out.printf("[사원번호: %d]의 이름, 직책, 부서를 입력 : ", empGroup[i].getEno());
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

	// 모든 사원들을 display한다.
	public void display() {
		for (int i = 0; i < empGroup.length; i++) {
			System.out.println(empGroup[i]); // 주소값 -> toString()에 정의된 문자열 출력
		}
	}

	// 모든 사원들을 검색하면서 검색하고자 하는 position과 맞는 사원을 출력한다.
	public Employees searchbyPosition(String positionInput) {
		int count = 0;
		// 검색하고자 하는 position과 맞는 사원 수 확인
		for (int i = 0; i < empGroup.length; i++) {
			if (empGroup[i].getPosition().equals(positionInput)) {
				count++;
			}
		}

		Employees searchPos = new Employees(count); // 검색 결과를 저장 배열
		searchPos.init();
		int searchPosIdx = 0; // 검색 결과를 저장하는 배열 인덱스 (searchPos)
		for (int i = 0; i < empGroup.length; i++) {
			if (empGroup[i].getPosition().equals(positionInput)) {
				searchPos.empGroup[searchPosIdx++] = empGroup[i];
			}
		}
		return searchPos;
	}

	// 모든 사원들을 검색하면서 검색하고자 하는 department과 맞는 사원을 출력한다.
	public Employees searchbyDepart(String departInput) {
		int count = 0;
		// 검색하고자 하는 department과 맞는 사원 수 확인
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
