package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 배열 (array)
		 * : 동일한 데이터 타입 (***)의 
		 * 서로 관계있는 데이터 여러개를 저장할 수 있는 공간
		 * 
		 * : 하나의 변수 이름으로 접근 가능 (인덱스를 통해)
		 * 
		 * 
		 * ex) 5명 학생에 대한 5개 과목 성적 평균 구하는 문제에서
		 * 1번 학생의 국어 성적?
		 * */
		
		/*
		 * 기본 타입: int, double, float, char, boolean
		 * -> 변수 공간에 데이터 자체를 저장
		 * 
		 * 참조 타입: 배열, String, 클래스 ....
		 * -> 변수 공간에 주소값을 저장
		 * -> 메모리의 주소값을 알고 있으면 원소값을 찾을 수 있음
		 * ex) scores: 첫번째 원소의 위치 (주소값)
		 * */
		
		
		int[] scores = new int[5];
		// 5명의 성적을 저장할 수 있는 배열 (자바 스타일)
		// 여기서 대괄호는 scores라는 변수가 일반 int형 변수가 아니고
		// int[]형 변수 (int형 데이터를 여러개 저장할 수 있는 배열)
		
//		int scores[] = new int[5]; 
		// C언어 스타일 배열 선언
		
		// new int[5]: 메모리 공간 (힙)에 int형 할당할 수 있는 5칸을 만듦
		// new는 배열의 원소가 다음과 같이 초기화 됨
		// - int: 0
		// - double/float: 0.0/0.0f
		// - boolean: false
		// - char: null
		
		// 배열에서 각 원소를 접근하는 방법
		// 인덱스 (index): 원소의 순번 (0번부터 시작)
		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i < scores.length; i++) {
//			System.out.printf("%d번 학생 성적 입력: ", i+1);
//			scores[i] = sc.nextInt();
//		}
////		scores[0] = 90;
////		scores[1] = 85;
////		scores[2] = 95;
////		scores[3] = 60;
////		scores[4] = 70;
////		scores[5] = 60; // ArrayIndexOutOfBounds
//		
//		int sum = 0;
//		for(int i = 0; i < scores.length; i++) { // 인덱스 접근
//			sum += scores[i];
//		}
//		System.out.println("평균 : " 
//		+ (double)sum / scores.length);
//		
//		// Q1. 성적 중에 최댓값, 최솟값
//		
//		// 학생 성적을 저장
//		int min = scores[0]; // 최솟값을 scores[0]이라고 가정
//		int max = scores[0]; // 최댓값을 scores[0]이라고 가정
//		
//		// 학생 번호를 저장
//		int min_index = 0; // 최소 성적을 가진 학생 번호가 0이라고 가정
//		int max_index = 0; // 최대 성적을 가진 학생 번호가 0이라고 가정
//		for(int i = 1; i < scores.length; i++) {
////			score = sc.nextInt();
////			if(i == 0) {
////				min = score;
////				max = score;
////			}
//			
//			if(max < scores[i]) {
//				max = scores[i]; 
//				max_index = i;
//			}
//			if(min > scores[i]) {
//				min = scores[i]; 
//				min_index = i;
//			}
//		}
//		System.out.printf("[최저 점수] 학생 번호: %d, 점수: %d입니다.\n", 
//				min_index+1, min);
//		System.out.printf("[최고 점수] 학생 번호: %d, 점수: %d입니다.\n", 
//				max_index+1, max);
//		
//		// Q2. 성적 중에 TOP3
//		// 1) TOP3 학생 번호도 같이 출력
//		// 2) 이중 반복문으로 바꿔보기
//		
//		int[] top = new int[3]; // 0: top1, 1: top2, 2: top3
//		int[] top_index = new int[3];
//		top[0] = max; // top1의 성적
//		top[1] = min; // top2의 성적
//		top[2] = min; // top3의 성적
//		top_index[0] = max_index; // top1의 성적을 가진 학생 번호
//		top_index[1] = min_index; // top2의 학생 번호
//		top_index[2] = min_index; // top3의 학생 번호
//		
//		// top2
//		for(int i = 0; i < scores.length; i++) {
//			if(top[1] < scores[i] && scores[i] != top[0]) {
//				top[1] = scores[i];
//				top_index[1] = i;
//			}
//		}
//		
//		// top3
//		for(int i = 0; i < scores.length; i++) {
//			if(top[2] < scores[i] 
//					&& scores[i] != top[0] 
//							&& scores[i] != top[1]) {
//				top[2] = scores[i];
//				top_index[2] = i;
//			}
//		}	
//		
//		for(int i = 0; i < top.length; i++) {
//			System.out.printf("[ranking %d] "
//					+ "학생번호: %d 성적: %d\n", 
//					i+1, top_index[i]+1, top[i]);
//		}
//		
		// Q3. 학점 계산
		// 90점 이상 => 'A'
		// 80점 이상 ~ 90점 미만 => 'B'
		// 70점 이상 ~ 80점 미만 => 'C'
		// 60점 이상 ~ 70점 미만 => 'D'
		// 이외 성적 => 'F'
//		
//		char[] grades = new char[scores.length]; // 5명 학생의 학점 저장
//		for(int i = 0; i < scores.length; i++) {
//			if(scores[i] >= 90) {
//				grades[i] = 'A';
//			}
//			else if(scores[i] >= 80) {
//				grades[i] = 'B';
//			}
//			else if(scores[i] >= 70) {
//				grades[i] = 'C';
//			}
//			else if(scores[i] >= 60) {
//				grades[i] = 'D';
//			}
//			else {
//				grades[i] = 'F';
//			}
//			System.out.printf("[%d번째 학생] 성적: %d, 학점: %c\n",
//					i+1, scores[i], grades[i]);
//		}
		
//		int score1;
//		int score2;
//		int score3;
//		int score4;
//		// ...score5 (성적 5개)
//		
//		Scanner sc = new Scanner(System.in);
//		int score = 0;  // 성적 변수
//		int sum = 0; // 
//		double avg = 0; // 학생 5명에 대한 성적 평균
//		for(int i = 0; i < 5; i++) { // 학생 5명을 돌면서
//			System.out.printf("%d번째 학생의 성적 입력: ", i+1);
//			score = sc.nextInt();
//			sum += score;
//		}
//		avg = sum / 5.0; 
//		System.out.printf("학생의 평균은 %f점입니다.\n", i+1, avg);
		
//		System.out.println(score); // 5번 학생의 성적 (마지막 데이터)
//		
		
		
//		int[] scores = new int[5];
		// 5명의 성적을 저장할 수 있는 배열 (자바 스타일)
		
		// 배열 선언하자마자 데이터 초기화하는 경우 (new 사용 X)		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		System.out.println(arr1);
		
		// for each (인덱스 없이 간단하게 배열 원소 순서대로 출력)
		for(int element : arr1) {
			System.out.println(element);
		}
		
		
		////////////////////////////////////////
		// 배열이 저장된 주소값 동일한지 확인
		System.out.println(arr1 == arr2);
		
		
		// 배열을 구성하고 있는 원소값 동일한지 확인
		// 1) 배열의 사이즈가 같은지
		// 2) 배열 원소값이 동일한지
		
		boolean isEquals = true;
		if(arr1.length != arr2.length) {
			isEquals = false;
			return;
		}
		
		// arr1.length == arr2.length
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				isEquals = false;
				break;
			}
		}
		System.out.println(isEquals ? 
				"두 배열의 원소값 동일" : "두 배열의 원소값 다름");
		
		
		/////////////////////////////////////////////////
		// 배열 복사의 잘못된 예시
		int[] arr1_wrong = {1, 2, 3};
		int[] arr1_wrong_copy;
		arr1_wrong_copy = arr1_wrong;
		System.out.println(arr1_wrong);
		System.out.println(arr1_wrong_copy);
		// arr1 배열 이름 자체는 첫번째 원소의 주소값을 가지기 때문에
		// arr1_copy = arr1 (원본 주소값 복사)
		
		arr1_wrong_copy[0] = 10;
		
		for(int i = 0; i < arr1_wrong.length; i++) {
			System.out.print(arr1_wrong[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < arr1_wrong_copy.length; i++) {
			System.out.print(arr1_wrong_copy[i] + " ");
		}
		System.out.println();
		
		
		// 배열 복사의 정확한 예시
		int[] arr1_copy = new int[arr1.length]; // 새로운 공간 만듦
		
		System.out.println(arr1);
		System.out.println(arr1_copy);
		
		for(int i = 0; i < arr1_copy.length; i++) {
			arr1_copy[i] = arr1[i];
			// 주소는 알려주지 않고 데이터만 복사
		}
		
		arr1_copy[0] = 10;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < arr1_copy.length; i++) {
			System.out.print(arr1_copy[i] + " ");
		}
		
		
		
	}

}





