package object_compare;

import java.util.Arrays;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "홍길동", "사원", "개발팀");
		Employee e2 = new Employee(2, "박박박", "사원", "개발팀");
		Employee e0 = new Employee(0, "박길길", "사원", "개발팀");
		Employee[] e = {e1, e2, e0};
		System.out.println(e[0] == e1);
		
//		System.out.println(e1 > e2); // 연산자로는 객체 비교 불가
		
		/* 객체 비교
		 * 1) Comparable 인터페이스 안의 compareTo() 구현
		 * 2) Comparator 인터페이스 안의 compare() 구현
		 * */
		int c = e1.compareTo(e2);
		System.out.println(c);
		
		////////////////////////////////////////////////
		// 1) Comparable
		// 이미 객체가 알고 있는 Comparable 방법 (compareTo())으로 정렬
		// => Employee implements Comparable (정의 되어있음)		
		Arrays.sort(e); 
		
		// sort(): 기본값 오름차순 정렬
		// -1: 그대로
		// 0: 비교 불가
		// 1: 위치 변경 (swap)
		
		// for-each문
		for(Employee emp : e) {
			System.out.println(emp);
		}
		System.out.println();
		
		////////////////////////////////////////////////
		// 2) Comparator
		// 객체가 모르는 새로운 정렬 방법을 정의하는 Comparator 방법 (compare())으로 정렬
		// Q1. 이름 기준으로 비교 (s1.compareTo(s2))
		Arrays.sort(e, new EmployeeNameComparator()); 
		for(Employee emp : e) {
			System.out.println(emp);
		}
		System.out.println();
		
		// Q2. 1) 사원번호 2) 이름 (사원번호가 같으면)
		Employee ec1 = new Employee(0, "홍길동", "사원", "영업팀");
		Employee ec2 = new Employee(2, "박박박", "사원", "개발팀");
		Employee ec0 = new Employee(0, "박길길", "사원", "개발팀");
		Employee[] ec = {ec1, ec2, ec0};
		Arrays.sort(ec, new EmployeeEnoNameComparator()); 
		for(Employee emp : ec) {
			System.out.println(emp);
		}
		System.out.println();
		
		// Q3. 사원번호 내림차순 정렬하는 EmployeeEnobyDecComparator
		Employee ecd1 = new Employee(1, "홍길동", "사원", "개발팀");
		Employee ecd2 = new Employee(2, "박박박", "사원", "개발팀");
		Employee ecd0 = new Employee(0, "박길길", "사원", "개발팀");
		Employee[] ecd = {ecd1, ecd2, ecd0};
		Arrays.sort(ecd, new EmployeeEnobyDecComparator()); 
		for(Employee emp : ecd) {
			System.out.println(emp);
		}
	}

}
